package java200.ex01.day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class day11_01 {

	public static void main(String[] args) {
		List<Integer> mmlists=Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach(
				m->{System.out.printf(m+"\t");});
		System.out.println();
		Consumer<Integer>consume=(Integer m)->{System.out.printf(m+"\t");};
		mmlists.forEach(consume);
	}

}
