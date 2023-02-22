package java200.ex01.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class day12_1 {

	public static void main(String[] args) {
		List<Integer>ilist=new ArrayList<>();
		int s =0;
		for(int i=1; i<=10; i++) {
			ilist.add(i);
		}
		ilist=ilist.stream().filter(i->i%2==1).map(i -> i*i).collect(Collectors.toList());
		ilist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~10 ������ Ȧ���� ���� ������:"+s);

	}

}
