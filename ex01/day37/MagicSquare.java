package java200.ex01.day37;

public class MagicSquare implements IMagicSquare {
	protected int [][] magic;
	protected int n;
	
	public int[][] getMagic(){
		return magic;
	}
	public MagicSquare(int n) {
		magic = new int[n][n];
		this.n = n;
	}
	
	public void make() {
		int x=0;
		int y=n/2;
		for(int i = 1; i<=n*n; i++) {
			int temX=x;
			int temY=y;
			System.out.printf("(%d,%d)\t",x,y);
			magic[x][y]=i;
			if(x-1<0) {
				x=n-1;
			}else {
				x--;
			}if(y-1<0){
				y=n-1;
			}else {
				y--;
			}if(magic[x][y]!=0) {
				x=temX+1;
				y=temY;
			}
		}
	}
	public void print() {
		System.out.println();
		System.out.println(n+ "is magic:"+isMasic());
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private boolean isMasic() {
		boolean isM=true;
		int[]m=new int[2*n+2];
		for(int i=0; i<n; i++) {
			if(m[0]==0 || m[0]!=m[i]){
				isM=false;
				break;
			}
		}
		return isM;
	}
}
