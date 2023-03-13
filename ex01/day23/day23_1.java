package java200.ex01.day23;

public class day23_1 {
	private String cardVal;

	public String getCardVal() {
		return cardVal;
	}
	public day23_1() {
		this("H2");
	}
	public day23_1(String s) {
		this.cardVal=s;
	}
	public day23_1(day23_1 c) {
		this(c.getCardVal());
	}
	@Override
	public String toString() {
		return "["+cardVal+"]";
	}
	
}
