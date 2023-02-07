package java200.ex01.day01;

public class day01_2 {
	public double lat;
	public double lng;
	public static void main(String[] args) {
		double a = 37.654654;
		double b = 123.654645;
		
		day01_2 jdbc = new day01_2();
		jdbc.lat=a;
		jdbc.lng=b;
		
		day01_2 jinhyuk = jdbc;
		System.out.println(jinhyuk.lat);
	 
	}
}
