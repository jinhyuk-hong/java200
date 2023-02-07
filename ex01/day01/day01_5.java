package java200.ex01.day01;

public class day01_5 {

	public static void main(String[] args) {
	double S=6;
	double p=0.75;
	double l=200;
	double t=0;
	double a=1;
	double y=2;
	double up1=p*l*(y+9);
	double down=(t+1)*(a+1)*(y+10)*(l+20);
	double up2=12+3*S/8.0;
	double high = up1/down*up2;
	System.out.printf("적당한 하이힐 높이는 %1$.2fcm\n",high);

	}

}
