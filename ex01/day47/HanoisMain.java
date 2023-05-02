package java200.ex01.day47;

import java200.ex01.day46.Hanoi;

public class HanoisMain {

	public static void main(String[] args) {
		int tray=4;
		Hanoi ha = new Hanoi(tray);
		int[][] a = ha.getRings();
		HanoisUtil.showHanoi(a);
		HanoisUtil.moveHanoi(a, tray, 'a', 'b', 'c');
	}

}
