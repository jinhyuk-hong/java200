package java200.ex01.day03;

public class day03_1 {

	public static void main(String[] args) {
	FRUIT pear =FRUIT.APPLE;
	FRUIT pear2 =FRUIT.MANGO;
	
	System.out.println(pear);
	System.out.println(pear.name());
	System.out.println(pear.ordinal());
	System.out.println(pear2.ordinal());
	FRUIT[] fruits =FRUIT.values();
	System.out.println(fruits[0]);
	}
	public enum FRUIT{
		APPLE,BANANA,MANGO
	}
}
