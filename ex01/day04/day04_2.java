package java200.ex01.day04;

public class day04_2 {
	public static String textInfo(int index, double value) {
		String result="";
		switch(index) {
		case 23:result="��ü����"; break;
		case 28:result="��������";  break;
		case 33:result="��������"; break;
		}
		return result+(value*100);
	}
	public static void main(String[] args) {
		int index=23;
		double value=0.86;
		String st=textInfo(index, value);
		System.out.println(st);

	}

}
