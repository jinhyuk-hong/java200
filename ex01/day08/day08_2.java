package java200.ex01.day08;

public class day08_2 {
	public static int sumEach(int n) {
		int tot=0;
		while(n!=0) {
			tot+=n%10;
			n/=10;
		}
		return tot;
	}
	public static void main(String[] args) {
		int number=1234567;
		int value=sumEach(number);
		System.out.printf("%d�� ���� �� �ڸ��� ���� ��: %d\n",number,value);
		

	}

}
