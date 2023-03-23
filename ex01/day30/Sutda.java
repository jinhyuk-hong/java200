package java200.ex01.day30;

import java.util.Date;
import java.util.Scanner;

import java200.ex01.day24.day24_1;
import java200.ex01.day25.day25_1;
import java200.ex01.day28.day28_1;
import java200.ex01.day29.CardRule;

public class Sutda {
	day28_1 cc = new day28_1();
	CardRule rule = new CardRule();
	day25_1[]cc1=new day25_1[day24_1.SUTDA];
	day25_1[]cc2=new day25_1[day24_1.SUTDA];
	
	public Sutda() {
		cc.make();
	}
	private void divide() {
		for(int i = 0; i<day24_1.SUTDA; i++) {
			cc1[i]=cc.getCard(i);
			cc2[i]=cc.getCard(i+day24_1.SUTDA);
		}
	}
	public void divide2() {
		for(int i = 0,j=0; i<cc1.length; i++, j+=2) {
			cc1[i]=cc.getCard(j);
			cc2[i]=cc.getCard(j+1);
		}
	}
	public void play() {
		Scanner scan = new Scanner(System.in);
		System.out.println("섯다 게임에 오신것을 환영합니다"+new Date()+"!!");
		System.out.println("Start");
		String ss="N";
		do {
			cc.shuffle();
			
			divide2();
			int v1 = rule.rule(cc1[0], cc1[1]);
			int v2 = rule.rule(cc2[0], cc2[1]);
			if(v1>v2) {
				System.out.println("You Win!");
			}else if(v1<v2) {
				System.out.println("You Lose!");
			}else {
				System.out.println("You Same!");
			}
			cc.print();
			System.out.println("You");
			System.out.printf(cc1[0]+" "+cc1[1]);
			System.out.println(rule.rule(cc1[0], cc1[1]));
			System.out.println("Com");
			System.out.printf(cc2[0]+" "+cc2[1]);
			System.out.println(rule.rule(cc2[0], cc2[1]));
			System.out.println("WelCome To SutDa"+new Date()+"!!");
			System.out.println("DoYou Want to replay again(Y/n!!");
			ss = scan.next();
			
		}while((ss.toUpperCase()).equalsIgnoreCase("Y"));
		System.out.println("GoodBye~~");
	}
	
}
