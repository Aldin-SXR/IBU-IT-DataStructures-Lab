package ds.elementary.sorts;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] elements = new int[100000];
	    Random random = new Random();
		
		/* Generate random elements */
		for (int i = 0; i < elements.length; i++) {
			elements[i] = random.nextInt(100000);
		}
		
		/* Sort the array */
		long start = System.currentTimeMillis();
		ShellSort.sort(elements);
		System.out.println("time: " + (System.currentTimeMillis() - start) + " ms");

		
		/* Print the elements */
//		for (int i: elements) {
//			System.out.println(i);
//		}
	}

}


