package java200.ex01.day31;

import java200.ex01.day28.day28_1;

public class CardPrint {
	day28_1 cc = new day28_1();
	CardLaw rule = new CardLaw();
	
	private int TotalPlayer;
	private int TotalDealer;
	
	public CardPrint() {}
	public void shuffle() {
		cc.shuffle();
	}
	public void print() {
		System.out.println("<플레이어 카드>");
		System.out.println("-------------");
		System.out.println("첫번째 카드");
		System.out.println(cc.getCards().get(0));
		System.out.println("첫번쨰 카드 수:");
		System.out.println(num(0));
		
		System.out.println("뱅커의 2장의 카드합:");
		System.out.println(sumD());
		TotalDealer = sumD();
	}
}
