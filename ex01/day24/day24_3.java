package java200.ex01.day24;

public class day24_3 {

	public static void main(String[] args) {
		day24_2 c1 = new day24_2("H4");
		day24_2 c2 = new day24_2("H4");
		/* day24_2 c3 = new day24_2(c1); */
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2));
		/* System.out.println(c1.equals(c3)); */
		for(int i=0; i<day24_1.SUIT.length; i++) {
			for(int j=0; j<day24_1.VALU.length; j++){
				day24_2 c = new day24_2();
				System.out.printf("%s\t",c);
			}
			System.out.println();
		}
	}
}
