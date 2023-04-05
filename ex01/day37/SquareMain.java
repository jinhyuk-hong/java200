package java200.ex01.day37;

import java.util.Scanner;

import java200.ex01.day33.OddMagicSquare;
import java200.ex01.day35.FourMagicSquare;
import java200.ex01.day36.SixMagicSquare;



public class SquareMain {

	public static void main(String[] args) {
		System.out.println("3이상의 정수 마방진 입력");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		IMagicSquare magic = null;
		if(n>2 && n%2==1) {
			magic = new OddMagicSquare(n);
		}else if(n>2 && n%4==0) {
			magic = new FourMagicSquare(n);
		}else if(n>2 && n%4==2) {
			magic = new SixMagicSquare(n);
		}else {
			System.out.println("만들수 없는 마방진");
			return;
		}
		MagicPrint.print(magic);

	}

}
