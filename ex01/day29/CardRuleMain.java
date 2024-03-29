package java200.ex01.day29;

import java200.ex01.day28.day28_1;

public class CardRuleMain {

	public static void main(String[] args) {
		day28_1 cc = new day28_1();
		cc.make();
		CardRule rule = new CardRule();
		for(int i=0; i<5; i++) {
			System.out.println("===============");
			cc.shuffle();
			cc.print();
			int a=rule.rule(cc.getCard(0), cc.getCard(2));
			int b = rule.rule(cc.getCard(1), cc.getCard(3));
			System.out.println(cc.getCard(0)+" "+cc.getCard(2)+" "+a);
			System.out.println(cc.getCard(1)+" "+cc.getCard(3)+" "+b);
		}
		System.out.println("=========================");
	}

}
