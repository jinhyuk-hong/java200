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
		
		System.out.println("두번째 카드");
		System.out.println(cc.getCards().get(1));
		System.out.println("두번쨰 카드 수:");
		System.out.println(num(1));
		
		System.out.println("플레이어의 2장의 카드합 :");
		System.out.println(sumP());
		TotalPlayer = sumP();
		
		System.out.println("--------------");
		
		if(rule.natural(sumP(), sumD())) {
			System.out.println("예외처리로 바로 겨룹니다!");
			TotalPlayer = sumP();
		}else if(rule.stand(sumP(), sumD())) {
			standPrintP1();
		}else if(rule.thirdCardDealer(sumP())) {
			System.out.println("세번째 카드");
			System.out.println("세번쨰 카드 :"+cc.getCards().get(4));
			System.out.println("첫번쨰 카드 수:" + num(4));
			System.out.println("----------------");
			System.out.println("플레이어 총 카드 합:"+total(sumP(),num(4)));
			TotalPlayer=total(sumP(),num(4));
		}
		System.out.println("------------");
		System.out.println();
		System.out.println("<뱅커 카드>");
		System.out.println("------------");
		System.out.println("1번째 카드:");
		System.out.println(cc.getCards().get(2));
		System.out.println("1번째 카드 수:");
		System.out.println(num(2));
	}
}
