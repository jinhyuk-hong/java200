package java200.ex01.day02;

public class day2_2 {
	public static final int PHYSICAL=23;
	public static double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days%index)*2*Math.PI/index);
	}
	public static void main(String[] args) {
		int days=1200;
		double phyval=getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의신체지수는 %1$.2f 입니다\n",phyval);
	
	}
}
