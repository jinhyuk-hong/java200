package java200.ex01.day38;

import java.util.Scanner;

import java200.ex01.day37.IMagicSquare;
import java200.ex01.day37.MagicPrint;

public class SquareMain {

	public static void main(String[] args) {
	System.out.println("3 이상의 정수 마방진을 입력");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	try(FactoryMagic magicFactory = FactoryMagic.getInstance()){
		IMagicSquare magic = magicFactory.getMagicSquare(n);
		MagicPrint.print(magic);
		
	}catch(MagicException e) {
		System.out.println(e);
	}catch(Exception e1) {
		
	}
	}

}
