package java200.ex01.day34;

public class OddMagicSquare {
	private int [][] magic;
	private int n;
	
	public void print() {
		System.out.println();
		System.out.println(n+"is magic:"+isMasic());
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			System.out.println(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}
	private int sumRow(int row) {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[row][i];
		}
		return tot;
	}
	private int sumCol(int col) {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][col];
		}
		return tot;
	}
	private int sumDia() {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][n-1-i];
		}
		return tot;
	}
	private int sumReverseDia() {
		int tot=0;
		for(int i=0; i<n; i++) {
			tot+=magic[i][i];
		}
		return tot;
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
