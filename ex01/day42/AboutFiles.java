package java200.ex01.day42;

import java.io.File;
import java.util.Date;

import java200.ex01.day39.RestDay;

public class AboutFiles {
	
	public void printTree(File ff) {
		if(ff.exists()) {
			File[]fd=ff.listFiles();
			if(fd==null||fd.length==0) {
				return;
			}else {
				for(File f:fd) {
					if(f.isDirectory()) {
						System.out.println(f.getAbsolutePath());
					}
				}
			}
		}
	}
	public static void aboutFile(File f) {
		System.out.println("--------------");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(RestDay.toStrDate(new Date(f.lastModified())));
		System.out.println("canRead:"+f.canRead());
		System.out.println(f.length()+"bytes.");
	}
	public static void printTree2(File ff) {
		if(ff.exists()) {
			File
		}
	}
}
