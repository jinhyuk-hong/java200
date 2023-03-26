package java200.ex01.day31;

import java200.ex01.day25.day25_1;
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
			standPrintPI();
		}else if(rule.thirdCardDealer(sumD(),num(4))) {
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
		System.out.println("2번째 카드");
		System.out.println(cc.getCards().get(3));
		System.out.println("2번째 카드 수:");
		System.out.println(num(3));      
		
		System.out.println("뱅커의 2장의 카드 합: ");
		System.out.println(sumD());
		TotalDealer=sumD();
		
		System.out.println("----------------");
		if(rule.natural(sumP(), sumD())) {
			System.out.println("예외 처리로 바로 겨릅니다!");
			TotalDealer=sumD();
		}else if(rule.stand(sumP(), sumD())) {
			standPrintDI();
		}else if(rule.thirdCardDealer(sumD(),num(4))) {
			System.out.println("3번째 카드를 받습니다");
			System.out.println("3번째 카드"+cc.getCards().get(5));
			System.out.println("3번째 카드 수:"+num(5));
			System.out.println("----------------");
			System.out.println("뱅커의 총 카드 합: "+total(sumD(),num(5)));
			TotalDealer = total(sumD(),num(5));
		}
		System.out.println("----------------");
		System.out.println();
	}
	public void standPrintPI() {
		System.out.println("스탠드 입니다");
		if(sumP()>5&&sumP()<8) {
			if(sumD()<6) {
				System.out.println("뱅커는 3번째 카드를 받습니다");
			}else {
				System.out.println("바로 겨룹니다!");
				TotalPlayer = sumP();
			}
		}else if(sumD()==7) {
			if(sumP()<6) {
				System.out.println("3번째 카드를 받습니다");
				System.out.println("3번째 카드"+cc.getCards().get(4));
				System.out.println("3번째 카드 수:"+num(4));
				System.out.println("----------------");
				System.out.println("플레이어의 총 카드 합: "+total(sumD(),num(4)));
				TotalPlayer = total(sumD(),num(4));
			}else {
				System.out.println("바로 겨룹니다");
				TotalPlayer=sumP();
			}
		}
	}
	public void standPrintDI() {
		System.out.println("스탠드입니다");
		if(sumP()>5 && sumP()<8) {
			if(sumD()<6) {
				System.out.println("3번째 카드를 받습니다");
				System.out.println("3번째 카드"+cc.getCards().get(5));
				System.out.println("3번째 카드 수:"+num(5));
				System.out.println("----------------");
				System.out.println("뱅커의 총 카드 합: "+total(sumD(),num(5)));
				TotalDealer = total(sumD(),num(5));
			}else {
				System.out.println("바로 겨룹니다");
				TotalDealer=sumD();
			}
		}else if(sumD()==7) {
			if(sumP()<6) {
				System.out.println("플레이어는 3번째 카드를 받습니다");
			}else {
				System.out.println("바로 겨룹니다");
				TotalDealer=sumD();
			}
		}
		
	}
	public int num(int n) {
		int num;
		day25_1 str = cc.getCards().get(n);
		char ch = str.getCardVal().charAt(1);
		switch(ch) {
		case 'A' : num = 1; break;
		case 'T' :
		case 'J' :
		case 'Q' :
		case 'K' : num=0; break;
		default : num=ch-'0'; break;
		}
		return num;
	}
	public int sumP() {
		int sumP=0;
		for(int i=0; i<2; i++) {
			sumP+=num(i);
				if(sumP>9) {
					sumP -= 10;
			}
		}
		return sumP;
	}
	public int sumD() {
		int sumD = 0;
		for(int i= 2; i<4; i++) {
			sumD += num(i);
		}
		return sumD%10;
	}
	public int total(int x, int y) {
		return(x+y)%10;
	}
	public int returnPlayer() {
		return TotalPlayer;
	}
	public int returnDealer() {
		return TotalDealer;
	}
}
