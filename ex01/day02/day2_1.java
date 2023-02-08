package java200.ex01.day02;

public class day2_1 {
	public static final int PHYSICAL=23;
	public static void main(String[] args) {
		int index = PHYSICAL;
		int day= 1200;
		double phyval = 100*Math.sin((day%index)*2*Math.PI/index);
		System.out.printf("나의 신체지수는 %1$.2f입니다\n",phyval);
	}

}
