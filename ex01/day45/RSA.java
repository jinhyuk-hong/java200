package java200.ex01.day45;

public class RSA {
	public static final int START = 200;
	private int p=11;
	private int q = 7;
	private int n;
	private int phiN;
	private int e;
	private int d;
	public void makePQ() {
		p=(int)(Math.random()*START);
		q=(int)(Math.random()*START);
		while((p==q)||(p<100||q<100)||(!Java200Math.isPrime(p)||!Java200Math.isPrime(q))) {
			p = (int)(Math.random()*START);
			q = (int)(Math.random()*START);
		}
	}
	public void makeN() {
		n=p*q;
	}
	public int getN() {
		return n;
	}
	public void print() {
		System.out.printf("(p,q)=(%d,%d)\n"+"(n,phi)=(%d,%d)\n(e,d)=(%d,%d)\n",p,q,n,phiN,e,d);
	}
	public void makePHIN() {
		this.phiN=(p-1)*(q-1);
	}
}
