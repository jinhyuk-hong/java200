package java200.ex01.day06;

public class day06_2 {
	public static double toMoney(String c) {
		double tot=0.0;
		switch(c) {
		case"USD":tot=1126.5; break;
		case"JPY":tot=110.6; break;
		case"CHY":tot=10.5; break;
		default: tot=1; break;
		}
		return tot;
	}
	public static void main(String[]args) {
		String money="USD";
		double result=toMoney(money);
		System.out.printf("%s=>%f\n",money,result);
	}
}
