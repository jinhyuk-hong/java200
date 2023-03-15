package java200.ex01.day25;

public class day25_2 {
	public static void main(String[]args) {
		day25_1 c1 = new day25_1("H4");
		day25_1 c2 = new day25_1("H4");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2));
	}
}
