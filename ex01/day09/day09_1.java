package java200.ex01.day09;

public class day09_1 {
	public static boolean isPrime(int n) {
		boolean isS=true;
		for(int i=2; i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) {
				isS=false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[]args) {
		int number=1234567;
		boolean isPrime=isPrime(number);
		if(isPrime) {
			System.out.printf("%d�� 1�� �ڽ����θ� ���������� �Ҽ���.",number);
		}else {
			System.out.printf
			("%d�� �Ҽ��� �ƴϴ�",number);
		}
	}
}
