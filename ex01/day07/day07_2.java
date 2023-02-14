package java200.ex01.day07;

public class day07_2 {
	public static void showOddnevent(int n) {
		int temp=n;
		do {
			if(temp%2==1) {
				temp=temp*3+1;
			}else {
				temp/=2;
			}
			System.out.println("["+temp+"]");
		}while(temp!=1);
			System.out.println("\n--------------");
		}
	public static void main(String[]args) {
		showOddnevent(122);
	}
}
