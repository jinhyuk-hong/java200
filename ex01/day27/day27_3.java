package java200.ex01.day27;

import java.util.Comparator;

import java200.ex01.day23.day23_1;
import java200.ex01.day24.day24_1;


public class day27_3 implements Comparator<day23_1>{

	@Override
	public int compare(day23_1 c1, day23_1 c2) {
		if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)) {
			return 1;
		}else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)) {
			return -1;
		}else {
			if(day24_1.toVal(c1.getCardVal().charAt(1))<day24_1.toVal(c2.getCardVal().charAt(1))) {
				return 1;
			}else if(day24_1.toVal(c1.getCardVal().charAt(1))>day24_1.toVal(c2.getCardVal().charAt(1))) {
				return -1;
				
			}else return 0;
		}
	}
	
}
