package ds.binary.search;

public class BinarySearch {
	
	/* Binary search algorithm for integer arrays */
	public static int search(int[] elements, int key) {
		int low = 0;									// 1
		int high = elements.length - 1;					// 1
		
		while (low <= high) {							// 2
			int mid = low + (high - low) / 2;			// 3
			if (key < elements[mid]) {					// 4
				high = mid - 1;							// 4
			} else if (key > elements[mid]) {			// 5
				low = mid + 1;							// 5
			} else {									// 6
				return mid;								// 6
			}
		}
		return -1;										// 7
	}
}

