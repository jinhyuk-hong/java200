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
		
		System.out.println("�ι�° ī��");
		System.out.println(cc.getCards().get(1));
		System.out.println("�ι��� ī�� ��:");
		System.out.println(num(1));
		
		System.out.println("�÷��̾��� 2���� ī���� :");
		System.out.println(sumP());
		TotalPlayer = sumP();
		
		System.out.println("--------------");
		
		if(rule.natural(sumP(), sumD())) {
			System.out.println("����ó���� �ٷ� �ܷ�ϴ�!");
			TotalPlayer = sumP();
		}else if(rule.stand(sumP(), sumD())) {
			standPrintP1();
		}else if(rule.thirdCardDealer(sumP())) {
			System.out.println("����° ī��");
			System.out.println("������ ī�� :"+cc.getCards().get(4));
			System.out.println("ù���� ī�� ��:" + num(4));
			System.out.println("----------------");
			System.out.println("�÷��̾� �� ī�� ��:"+total(sumP(),num(4)));
			TotalPlayer=total(sumP(),num(4));
		}
		System.out.println("------------");
		System.out.println();
		System.out.println("<��Ŀ ī��>");
		System.out.println("------------");
		System.out.println("1��° ī��:");
		System.out.println(cc.getCards().get(2));
		System.out.println("1��° ī�� ��:");
		System.out.println(num(2));
	}
}
