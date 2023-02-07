package java200.ex01.day01;

public class day01_6 {

	public static void main(String[] args) {
		char a= '닳';
		String song="동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int Number=song.length();
		int loc=song.indexOf(a);
		System.out.printf("%d자이며,'%c'은%d번째에 있다.\n",Number,a,loc);
		

	}

}
