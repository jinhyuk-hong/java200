package java200.ex01.day38;

import java200.ex01.day33.OddMagicSquare;
import java200.ex01.day35.FourMagicSquare;
import java200.ex01.day36.SixMagicSquare;
import java200.ex01.day37.IMagicSquare;

public class FactoryMagic implements AutoClosable{
	private static FactoryMagic ins;
	private FactoryMagic() {}
	
	public static FactoryMagic getInstance() {
		if(ins==null) {
			ins = new FactoryMagic();
		}
		return ins;
	}
	public IMagicSquare getMagicSquare(int n) throws MagicException {
		IMagicSquare im = null;
		if(n<=2) {
			throw new MagicException("2보다 작은 수의 마방진은 ?");
		}
		if(n%2!=0) {
			im= new OddMagicSquare(n);
		}else if(n%4==0) {
			im = new FourMagicSquare(n);
		}else {
			im=new SixMagicSquare(n);
			
		}
		return im;
	}

	@Override
	public void close() throws Exception{
		System.out.println("FactoryMagi End!");
	}
	
}
