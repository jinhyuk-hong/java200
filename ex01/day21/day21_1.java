package java200.ex01.day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;


public class day21_1 {
	public static void main(String[]args) {
		File f= new File("day18_1");
		File[]fd=f.listFiles();
		for(File ff:fd) {
			String fname=ff.getName();
			String post=fname.substring(fname.lastIndexOf("."));
			System.out.println(fname+" "+post);
			System.out.println(ff.getAbsolutePath());
			System.out.println(new Date(ff.lastModified()));
			try(BufferedReader br = new BufferedReader( new FileReader(ff.getAbsolutePath()))) {
				String msg="";
				while((msg=br.readLine())!=null) {
					System.out.println(msg);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("======================");
		}
		
	}
}
