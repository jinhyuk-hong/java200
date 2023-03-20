package java200.ex01.day28;

public class day28_2 {

	public static void main(String[] args) {
		day28_1 cc = new day28_1();
		cc.make();
		cc.print();
		System.out.println("=================");
		cc.shuffle();
		cc.print();
		System.out.println("=================");
		cc.shuffle();
		cc.print();
		System.out.println("=================");
		cc.sort();
		cc.print();
		System.out.println("=================");
		cc.rsort();
		cc.print();
		System.out.println("=================");
		cc.lambdasort();
		cc.print();
		System.out.println("=================");
		cc.lambdarsort();
		cc.print();

	}

}
