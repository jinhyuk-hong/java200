package java200.ex01.day33;

import java.util.Scanner;

public class OddMagicSquareMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Ȧ�� ������ �Է�");
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}

}
