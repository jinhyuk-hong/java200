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
		System.out.println("<�÷��̾� ī��>");
		System.out.println("-------------");
		System.out.println("ù��° ī��");
		System.out.println(cc.getCards().get(0));
		System.out.println("ù���� ī�� ��:");
		System.out.println(num(0));
		
		System.out.println("��Ŀ�� 2���� ī����:");
		System.out.println(sumD());
		TotalDealer = sumD();
	}
}
