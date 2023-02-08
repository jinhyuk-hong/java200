package java200.ex01.day02;

public class day2_3 {
	public static final int PHYSICAL=23;
	public double getBioRhythm(long day, int index, int max) {
		return max*Math.sin((day%index)*2*Math.PI/index);
	}
	public static void main(String[] args) {
		int days=1200;
		day2_3 bio = new day2_3();
		double phy=bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체지수는 %1$.2f\n",phy);
		

	}

}
