package ArrayExamples;

import java.util.Scanner;

public class BubbleSortedHackerRanker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int numberOfSwaps = 0;
		int temp;
		int intArray[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			intArray[a_i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					temp = intArray[j];
					intArray[j] = intArray[j + 1];
					intArray[j + 1] = temp;
					numberOfSwaps++;
				}
			}
		}
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + intArray[0]);
		System.out.println("Last Element: " + intArray[n - 1]);
	}
}