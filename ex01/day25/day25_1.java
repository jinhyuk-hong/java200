package java200.ex01.day25;

import java200.ex01.day24.day24_1;

public class day25_1 {
	private String cardVal;
	public String getCardVal() {
		return cardVal;
	}
	public day25_1() {
		int deck=(int)(Math.random()*day24_1.SUIT.length);
		int suit=(int)(Math.random()*day24_1.VALU.length);
		cardVal=day24_1.SUIT[deck]+day24_1.VALU[suit];
		
	}
	public day25_1(String s) {
		this.cardVal=s;
		
	}
	public day25_1(day25_1 c) {
		this(c.getCardVal());
	}
	@Override
	public String toString() {
		
		return "["+cardVal+"]";
	}
	@Override
	public int hashCode() {
	
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardVal == null)?0 : cardVal.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		day25_1 cb = (day25_1)obj;
		if(cardVal.equals(cb.getCardVal())) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
