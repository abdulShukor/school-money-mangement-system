package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[5];
		for (int k = 0; k < 5; k++)
			input[k] = scanner.nextInt();
		Arrays.sort(input);
		long minNumber = 0, maxNumber = 0;
		for (int i = 0; i < 4; i++) {
			minNumber += input[i];
			maxNumber += input[i + 1];
		}
		System.out.println(minNumber + " " + maxNumber);
	}
	// Arrays.sort(input); sort array very useful method:

}
