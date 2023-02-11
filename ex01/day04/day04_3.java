package java200.ex01.day04;

public class day04_3 {
	public static final int PHYSICAL =23;
	public static final int EMOTIONAL =28;
	public static final int INTELIECTUAL =33;
	public static String textInfo(int index, double value) {
		String result="";
		switch(index) {
		case PHYSICAL : result ="신체지수";break;
		case EMOTIONAL : result ="감정지수";break;
		case INTELIECTUAL : result ="지성지수";break;
		}
		return result+(value*100);
	}
		public static void main(String[] args) {
			int index=PHYSICAL;
			double value=0.86;
			String st=textInfo(index, value);
			System.err.println(st);
		}
	}

