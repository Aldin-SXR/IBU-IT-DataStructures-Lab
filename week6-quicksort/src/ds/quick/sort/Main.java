package ds.quick.sort;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[1000000];
	    Random random = new Random();
		
		/* Generate random elements */
		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(1000);
		}
		
		/* Sort the array */
		long start = System.currentTimeMillis();
		QuickSort.sort(elements);
		System.out.println("time: " + (System.currentTimeMillis() - start) + " ms");
		
		/* Print the elements */
//		for (int i: elements) {
//			System.out.println(i);
//		}
	}

}
