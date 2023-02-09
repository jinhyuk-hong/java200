package java200.ex01.day03;

public class day03_3 {
	
	public static void main(String[] args) {
		double a1=37.321351;
		double b1=127.003215;
		double a2=35.135135;
		double b2=129.165465;
		Geo geo1= new Geo();
		geo1.a=a1;
		geo1.b=b1;
		System.out.println(geo1.a+"\t"+geo1.b);
		Geo geo2= new Geo();
		geo2.a=a2;
		geo2.b=b2;
		Geo geo=geo1;
		System.out.println(geo.a+"\t"+geo.b);
		
	}
	
	
}


