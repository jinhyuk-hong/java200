	package java200.ex01.day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java200.ex01.day24.day24_1;
import java200.ex01.day25.day25_1;
import java200.ex01.day27.day27_1;
import java200.ex01.day27.day27_3;

public class day28_1 {
	private List<day25_1> cards = new ArrayList<day25_1>();
	public day28_1() {
		cards.clear();
	}
	public List<day25_1>getCards(){
		return cards;
	}
	public int count() {
		return cards.size();
		}
	public day25_1 getCard(int index) {
		return cards.get(index);
	}
	public void make() {
		cards.clear();
		int suit= day24_1.SUIT.length;
		int valu= day24_1.VALU.length;
		int count=0;
		while(count!=valu*suit) {
			day25_1 c = new day25_1();
			if(!cards.contains(c)) {
				cards.add(c);
				count++;
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public void print() {
		int valu = day24_1.VALU.length;
		for(int i=0; i<cards.size(); i++) {
			day25_1 c = cards.get(i);
			System.out.printf("%s",c.toString());
			if((i+1)%valu==0) {
				System.out.println();
			}
		}
	}
	public void sort() {
		cards.sort(new day27_1());
		Comparator<day25_1> cmp = new Comparator<day25_1>() {
			@Override
			public int compare(day25_1 c1, day25_1 c2) {
				return c1.getCardVal().compareTo(c2.getCardVal());
				}
		};
		cards.sort(cmp);
	}
	public void rsort() {
		cards.sort(new day27_3());
		cards.sort(new Comparator<day25_1>() {
			@Override
			public int compare(day25_1 c1, day25_1 c2) {
				return - c1.getCardVal().compareTo(c2.getCardVal());
			}
		});
	}
	public void lambdasort() {
		cards.sort((c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());});
	}
	public void lambdarsort() {
		cards.sort((c1,c2)->{return -c1.getCardVal().compareTo(c2.getCardVal());});
	}
}
