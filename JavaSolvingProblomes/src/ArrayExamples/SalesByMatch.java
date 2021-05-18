package ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner input = new Scanner(System.in);
		// int n = input.nextInt();
		// int[] hash = new int[300];
		// for (int i = 0; i < n; i++) {
		// hash[input.nextInt()]++;
		//
		// }
		// long ans = 0;
		// for (int p : hash) {
		// ans += p / 2;
		// }
		// System.out.println(ans);

		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.print(SalesByMatch(n, array));

	}

	public static int SalesByMatch(int n, int[] array) {
		Arrays.sort(array);// first sort the array 

		int current = array[0];
		int pair = 1;
		int count = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] == current) {
				count++;
				if (count == 2) {
					pair++;
					count = count - 2;
				}
			} else {
				current = array[i];
				count = 1;
			}
		}

		return pair;
	}
}

/*
 * Sample Input 9
 * 
 * 10 20 20 10 10 30 50 10 20 Sample Output
 * 
 * 3 the max pairs in the array 2 10 1 20
 * 
 */