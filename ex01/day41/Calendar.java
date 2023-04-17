package java200.ex01.day41;

public class Calendar {
	public int[] LEAPY= {31,29,31,30,31,30,31,31,30,31,30,31};
	public int[] PLAIN= {31,28,31,30,31,30,31,31,30,31,30,31};
	public boolean isLeapYear(int year) {
		boolean isS=false;
		if(((year%4==0)&&(year%100!=0))|| (year%400==0)) {
			isS=true;
		}
		return isS;
	}
	public int total(int year) {
		int tot=0;
		for(int i=1; i<year; i++) {
			if(isLeapYear(i)){
				tot+=366;
			}else {
				tot+=365;
			}
		}
		return tot;
	}
	public int total(int year, int month) {
		int tot=total(year);
		for(int i = 1; i<month; i++) {
			if(isLeapYear(year)) {
				tot+=LEAPY[i-1];
			}else {
				tot+=PLAIN[i-1];
			}
		}
		return tot;
	}

}
