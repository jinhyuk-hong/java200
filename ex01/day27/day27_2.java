package java200.ex01.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java200.ex01.day24.day24_1;
import java200.ex01.day25.day25_1;

public class day27_2 {
	private List<day25_1> cards = new ArrayList<day25_1>();
	public day27_2() {
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
		cards.sort(cards,new day27_1());
	}
	public void rsort() {
		cards.sort(cards,new day27_3());
	}
}
