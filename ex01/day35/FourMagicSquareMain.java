package java200.ex01.day35;

import java.util.Scanner;


public class FourMagicSquareMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("4��� ���� �Է�");
		FourMagicSquare fms = new FourMagicSquare(n);

		fms.make();
		fms.print();
	}

}
