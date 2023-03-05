package java200.ex01.day18;

public class day18_2 {
	public static void main(String[]args) {
		day18_1 b1 = new day18_1(1,"Despacito",1,"https://naver.com/images/jinhyuk_images/951207.jpg","jinhyuk11");
		showAbout(b1);
		
		day18_1 b=b1;
		showAbout(b);
	}
	public static void showAbout(day18_1 bb) {
		String sf=String.format("%d,%s,%d,%s,%s",bb.getRank(),bb.getSong(),bb.getLastweek(),bb.getImagesrc(),bb.getArtist());
		System.out.println(sf);
	}
}
