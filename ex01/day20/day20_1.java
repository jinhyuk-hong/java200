package java200.ex01.day20;

import java.util.ArrayList;

import java200.ex01.day18.day18_1;

public class day20_1 {

	public static void main(String[] args) {
		ArrayList<day18_1> bills= new ArrayList<>();
		bills.add(new day18_1(1,"jinhyuk",1,"https://www.naver.com/images/jinhyuk_image/jin.jpg","luis fonsi"));
		bills.add(new day18_1(2,"jinhyuk",2,"https://www.naver.com/images/jinhyuk_image/jin.jpg","bruno fonsi"));
		bills.add(new day18_1(3,"jinhyuk",3,"https://www.naver.com/images/jinhyuk_image/jin.jpg","dj fonsi"));
		System.out.println(bills.size());
		showAbout(bills.get(0));
		bills.remove(1);
		System.out.println(bills.size());
		System.out.println("---------------");
		for(day18_1 bb: bills) {
			showAbout(bb);
		}
	}
	public static void showAbout(day18_1 bb) {
		String sf=String.format("%d,%s,%d,%s,%s",bb.getRank() ,bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}

}
