package java200.ex01.day33;

import java.util.Scanner;

public class OddMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int n = scann.nextInt();
		System.out.println("홀수 정수를 입력");
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}

}
