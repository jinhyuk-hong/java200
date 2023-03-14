package java200.ex01.day24;

import java200.ex01.day23.day23_1;

public class day24_2 {
	private String cardVal;
	public String getCardVal() {
		return cardVal;
	}
	public day24_2() {
		int suit=(int)(Math.random()*day24_1.SUIT.length);
		int valu=(int)(Math.random()*day24_1.VALU.length);
		cardVal=day24_1.SUIT[suit]+day24_1.VALU[valu];
	}
	public day24_2(String s) {
		this.cardVal=s;
	}
	public day24_2(day23_1 c) {
		this(c.getCardVal());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+cardVal+"]";
	}
	

}
