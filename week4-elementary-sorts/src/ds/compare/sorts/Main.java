package ds.compare.sorts;

import java.util.Arrays;
import java.util.Random;

import ds.elementary.sorts.BubbleSort;
import ds.elementary.sorts.InsertionSort;
import ds.elementary.sorts.SelectionSort;
import ds.elementary.sorts.ShellSort;

public class Main {

	public static void main(String[] args) {
		int[] elements1 = new int[100000];
	    Random random = new Random();
		
		/* Generate random elements */
		for (int i = 0; i < elements1.length; i++) {
			elements1[i] = random.nextInt(1000);
		}
		
		Arrays.sort(elements1);
		
		/* Create "clones" of the original array, for same sorting conditions */
		int[] elements2 = elements1.clone();
		int[] elements3 = elements1.clone();
		int[] elements4 = elements1.clone();
		
		/* Bubble sort */
		long start = System.currentTimeMillis();
		BubbleSort.sort(elements1);
		System.out.println("bubble sort:\t" + (System.currentTimeMillis() - start) + " ms");
		
		/* Selection sort */
		start = System.currentTimeMillis();
		SelectionSort.sort(elements2);
		System.out.println("selection sort:\t" + (System.currentTimeMillis() - start) + " ms");
		
		/* Insertion sort */
		start = System.currentTimeMillis();
		InsertionSort.sort(elements3);
		System.out.println("insertion sort:\t" + (System.currentTimeMillis() - start) + " ms");
		
		/* Shell sort */
		start = System.currentTimeMillis();
		ShellSort.sort(elements4);
		System.out.println("Shell sort:\t" + (System.currentTimeMillis() - start) + " ms");
	}

}
