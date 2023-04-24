package java200.ex01.day45;

public class Java200Math {

	public static void printAmicable(int t1, int t2) {
		for(int i = t1; i<t2; i++) {
			int a = i;
			int b = divide(a);
			int c = divide(b);
			if(a<b && a==c) {
				System.out.printf("(%d,%d)는 친화수:",a,b);
				printDivide(a);
				printDivide(b);
			}
		}

	}
	public static void main(String[]args) {
		printAmicable(2,20000);
		
	}
	public static void printDivide(int n) {
		if(n==1) {
			System.out.println("[1]");
		}else {
			System.out.printf("[1,");
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					System.out.printf("%d,",i);
				}
			}
			System.out.println(n+"]");
		}
	}
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot+=n%10;
			n/=10;
		}
		return tot;
	}
	public static boolean isPrime(int n) {
		boolean isS=true;
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			if(n%i==0) {
				isS=false;
				break;
			}
		}
		return isS;
	}
	public static int sumSmith(int n) {
		int tot=0;
		int a=2;
		while(n!=1) {
			if(n%a==0) {
				tot+=sumEach(a);
				n/=a;
			}else {
				a++;
			}
		}
		return tot;
	}
	public static int divide(int num) {
		int tot=1;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				tot+=i;
			}
		}
		return tot;
	}
	public static void printPrimeDivide(int n) {
		int a=2;
		while(n!=1) {
			if(n%a==0) {
				if(n/a==1) {
					System.out.println(a);
				}else {
					System.out.print(a+"x");
				}
				n/=a;
			}else {
				a++;
			}
		}
	}
}
