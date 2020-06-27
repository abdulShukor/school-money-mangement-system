package Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	// This program finding average of positive, negative and zero numbers.
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner input = new Scanner(System.in);
		int n;
		int positiveNumber = 0;
		int negitiveNumber = 0;
		int zero = 0;
		int cur = 0;
		n = input.nextInt();

		for (int i = 0; i < n; i++) {
			cur = input.nextInt();
			if (cur > 0) {
				positiveNumber++;
				// System.out.println(++positiveNumber);
				// int a[] = new int[input.nextInt()];
				// System.out.println(a);

			} else if (cur == 0) {
				zero++;
			} else
				negitiveNumber++;
		}
		DecimalFormat doubleFloat = new DecimalFormat("0.000000");
		System.out.println(doubleFloat.format((double) positiveNumber / n));
		System.out.println(doubleFloat.format((double) negitiveNumber / n));
		System.out.println(doubleFloat.format((double) zero / n));
		input.close();

		// int n = input.nextInt();
		// plusMinus(5);

	}

	// wrapping the above code in method

	// public static void plusMinus(int n) {
	//
	// int positiveNumber = 0;
	// int negitiveNumber = 0;
	// int zero = 0;
	// int cur = 0;
	//
	// for (int i = 0; i < n; i++) {
	// cur = input.nextInt();
	// if (cur > 0) {
	// positiveNumber++;
	// // System.out.println(++positiveNumber);
	// // int a[] = new int[input.nextInt()];
	// // System.out.println(a);
	//
	// } else if (cur == 0) {
	// zero++;
	// } else
	// negitiveNumber++;
	// }
	//
	// DecimalFormat doubleFloat = new DecimalFormat("0.000000");
	// System.out.println(doubleFloat.format((double) positiveNumber / n));
	// System.out.println(doubleFloat.format((double) negitiveNumber / n));
	// System.out.println(doubleFloat.format((double) zero / n));
	// input.close();
	// }

}
