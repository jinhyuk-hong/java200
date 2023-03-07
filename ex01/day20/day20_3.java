package java200.ex01.day20;

import java.io.BufferedReader;
import java.io.FileReader;

public class day20_3 {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(
			new FileReader("day18_1\\bill.txt"))){
				String msg="";
				while((msg=br.readLine())!=null) {
					System.out.println(msg);
				}
			
			}catch(Exception e) {
				System.out.println(e);
		}

	}

}
