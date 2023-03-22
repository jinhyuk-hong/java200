package java200.ex01.day29;

import java200.ex01.day25.day25_1;

public class CardRule {
	public int toV(day25_1 c) {
		int count = 0;
		switch(c.getCardVal().charAt(1)) {
		case 'A':count=1; break;
		case 'T':count=10; break;
		default : count=c.getCardVal().charAt(1)-'0'; break;
		}
		return count;
	}
	public boolean isLight(day25_1 c) {
		boolean isL=false;
		if(c.getCardVal().charAt(0)=='C') {
			isL=true;
		}
		return isL;
	}
	private boolean is138(day25_1 c) {
		boolean isC=false;
		if(isLight(c)) {
			if(c.getCardVal().charAt(1)=='1'|| c.getCardVal().charAt(1)=='3'|| c.getCardVal().charAt(1)=='8') {
				isC=true;
			}
		}
		return isC;
	}
	public int rule(day25_1 c1, day25_1 c2) {
		int count=0;
		if(is138(c1)&& is138(c2)) {
			if((toV(c1)*toV(c2)==24)&&(toV(c1)+toV(c2)==11)) {
				count=3000;
			}else if((toV(c1)*toV(c2)==3)&&(toV(c1)+toV(c2)==4)) {
				count=2000;
			}else if((toV(c1)*toV(c2)==8)&&(toV(c1)+toV(c2)==9)) {
				count=2000;
			}
		}else {
			if((toV(c1)==toV(c2))) {
				count=toV(c1)*100;
		}else {
			if((toV(c1)*toV(c2)==2)&&(toV(c1)+toV(c2)==3)) {
				count=99;
			}else if((toV(c1)*toV(c2)==4)&&(toV(c1)+toV(c2)==5)) {
				count=98;
			}else if((toV(c1)*toV(c2)==9)&&(toV(c1)+toV(c2)==10)) {
				count=97;
			}else if((toV(c1)*toV(c2)==10)&&(toV(c1)+toV(c2)==11)) {
				count=96;
			}else if((toV(c1)*toV(c2)==40)&&(toV(c1)+toV(c2)==14)) {
				count=95;
			}else if((toV(c1)*toV(c2)==24)&&(toV(c1)+toV(c2)==10)) {
				count=94;
			}else {
				count=((toV(c1)+toV(c2))%10)*10;
			}
		}
	}
	return count;
}
}
