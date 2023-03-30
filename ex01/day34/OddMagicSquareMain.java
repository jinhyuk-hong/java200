package java200.ex01.day34;

import java.util.Scanner;
import java200.ex01.day33.OddMagicSquare;

public class OddMagicSquareMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("È¦¼ö¸¦ ÀÔ·Â");
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();

	}

}
