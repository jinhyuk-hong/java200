package java200.ex01.day36;

import java.util.Scanner;

import java200.ex01.day33.OddMagicSquare;
import java200.ex01.day35.FourMagicSquare;

public class SixMagicSquareMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("4배수 정수 입력");
		SixMagicSquare sms = new SixMagicSquare(n);
		
		sms.make();
		sms.print();
	}

}
