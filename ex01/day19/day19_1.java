package java200.ex01.day19;

import java200.ex01.day18.day18_1;

public class day19_1 {

	public static void main(String[] args) {
		
			day18_1 b1= new day18_1(1,"jinhyuk",1,"http://naver.com/images/jinhyuk_images/123.jpg","luis fonsi");
			day18_1 b2= new day18_1(2,"hong",2,"http://naver.com/images/jinhyuk_images/123.jpg","bruno fonsi");
			day18_1 b3= new day18_1(3,"good",3,"http://naver.com/images/jinhyuk_images/123.jpg","dj fonsi");
			showAbout(b1);
			showAbout(b2);
			showAbout(b1, b2);
			day18_1[] b= new day18_1[3];
			b[0]=new day18_1(1,"jinhyuk",1,"http://naver.com/images/jinhyuk_images/123.jpg","luis fonsi");
			b[1]=b2;
			b[2]=b3;
			showAbout(b[0],b[1]);
			showAbout(b);
	}
			public static void showAbout(day18_1 bb) {
				System.out.println("1-------------");
				String sf=String.format("%d,%s,%d,%s,%s", bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
				System.out.println(sf);
			}
			public static void showAbout(day18_1...b) {
				System.out.println("2===============");
				for(day18_1 bill:b) {
					showAbout(bill);
				}
			System.out.println("<==================2");
	}
}


