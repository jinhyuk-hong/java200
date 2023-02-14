	package java200.ex01.day07;

public class day07_1 {
	public static void showOddnEvent(int n) {
		int temp=n;
		while(temp!=1) {
			if(temp%2==1) {
				temp=temp*3+1;
			}else {
				temp/=2;
			}
			System.out.println("["+temp+"]");
			
		}
		System.out.println("\n-------------------");
	}
	public static void main(String[]args) {
		showOddnEvent(122);
	}
}
