package week6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[10000000];
		
		Random generator = new Random();
		for (int i = 0; i < elements.length; i++) {
			elements[i] = generator.nextInt(10000000);
		}
		
		long s = System.currentTimeMillis();
		QuickSort.sort(elements);
		System.out.println(System.currentTimeMillis() - s);
		
//		for (int i: elements) {
//			System.out.println(i);
//		}
	}

}
