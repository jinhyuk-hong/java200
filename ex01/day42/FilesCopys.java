package java200.ex01.day42;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;

public class FilesCopys {
	public static void copyUsingFiles(File source, File target) {
		try {
			Files.copy(source.toPath(), target.toPath());
		}catch(IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		File ff=new File("upload");
		File[]ffs = ff.listFiles();
		SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat fds = new SimpleDateFormat("yyyyMMdd");
		for(File fff:ffs) {
			String absfile = fff.getAbsolutePath();
			if(fff.isFile()) {
				String f=(absfile).substring(absfile.lastIndexOf("\\")+1);
				String fre="";
				if(f.indexOf('.')>=0) {
					fre=f.substring(0,f.indexOf('.'));
				}
			}
		}
	}

}
