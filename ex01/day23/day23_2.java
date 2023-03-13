package java200.ex01.day23;

public class day23_2 {
	public static void main(String[]args) {
		String csuit1="H",cvalu1="6";
		String csuit2="H",cvalu2="3";
		
		day23_1 c1 = new day23_1("H6");
		day23_1 c2 = new day23_1(csuit1+cvalu1);
		day23_1 c3 = new day23_1();
		day23_1 c4 = new day23_1(csuit2+cvalu2);
				
		System.out.printf("%s,%s,%s%s\n",c1,c2,c3,c4);
		System.out.println(c1.equals(c2));
		System.out.println(c1.getCardVal().equals(c2.getCardVal()));
	
	}
}
