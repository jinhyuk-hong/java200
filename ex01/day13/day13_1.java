package java200.ex01.day13;

public class day13_1 {

	public static void main(String[] args) {
		String sNum="123";
		String nNum="h";
		try {
			int a=Integer.parseInt(sNum);
			System.out.println(a);
		}catch(NumberFormatException ee) {
			System.out.println("int Ȯ��");
			System.out.println(ee.getMessage());
		}catch(Exception ee) {
			System.out.println("�Է� ���ض�");
		}finally {
			System.out.println("����");
		}

	}

}
