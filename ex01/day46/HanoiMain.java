package java200.ex01.day46;

public class HanoiMain {

	public static void main(String[] args) {
		int tray=4;
		Hanoi ha=new Hanoi(tray);
		ha.moveHanoi(tray, 'a', 'b', 'c');

	}

}
