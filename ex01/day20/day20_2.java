package java200.ex01.day20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java200.ex01.day18.day18_1;

public class day20_2 {

	public static void main(String[] args) {
		day18_1 b1 = new day18_1(1,"jinhyuk",1,"https://www.naver.com/images/jinhyuk_image/jin.jpg","luis fonsi");
		day18_1 b2 = new day18_1(2,"jinhyuk",2,"https://www.naver.com/images/jinhyuk_image/jin.jpg","bruno fonsi");
		day18_1 b3 = new day18_1(3,"jinhyuk",3,"https://www.naver.com/images/jinhyuk_image/jin.jpg","dj fonsi");
		ArrayList<day18_1> bblist=new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		File f= new File("day18_1");
		if(!f.exists()) {f.mkdirs();}
		try(PrintWriter pw=new PrintWriter(new FileWriter("billboard\\bill.txt",false),true)){
			for(day18_1 bb:bblist) {
				pw.println(bb);
			}
		}catch(IOException e) {
				System.out.println(e);
			}
			
		}
		
		

	}


