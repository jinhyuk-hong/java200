package java200.ex01.day44;

public class Jsort {
	public static void BubbleSort(int[]n) {
		for(int i=0; i<n.length-1; i++) {
			for(int j=0; j<n.length-1-i; j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}
	public static void print(int[]n) {
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]+ " ");
		}
		System.out.println();
	}
}
