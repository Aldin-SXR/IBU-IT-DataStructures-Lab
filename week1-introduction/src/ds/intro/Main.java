package ds.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Reading numbers...");
		int[] numbers = MaxInteger.readNumbers("/home/aldin-sxr/numbers.txt");
		int maxNumber = MaxInteger.findMax(numbers);
		System.out.println("Maximum number is: " + maxNumber);
		System.out.println("Writing to file...");
		MaxInteger.writeToFile("/home/aldin-sxr/maxNumber.txt", maxNumber);
	}
	
	/* Read the integer list from a file in the given path */
	public static int[] readNumbers(String path) throws FileNotFoundException {
		int[] numbers = new int[100];
		Scanner scanner = new Scanner(new File(path));
		int i = 0; // counter
		while (scanner.hasNextLine()) {
			numbers[i] = Integer.parseInt(scanner.nextLine());
			i++;
		}
		scanner.close();
		return numbers;
	}
	
	/* Find the maximum integer */
	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	/* Write the maximum number to a file */
	public static void writeToFile(String path, int maxNumber) throws IOException {
		File file = new File(path);
		FileWriter fw = new FileWriter(file);
		fw.write(Integer.toString(maxNumber));
		fw.close();
	}
}