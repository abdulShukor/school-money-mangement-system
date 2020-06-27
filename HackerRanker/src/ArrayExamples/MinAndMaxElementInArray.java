package ArrayExamples;

import java.util.Scanner;

public class MinAndMaxElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] n = {1,2,3,4,5,6,7,8,9};

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int maxNumber = 0;
		int minNumber = 4;
		int[] num = new int[5];
		// int num;

		for (int i = 0; i < n; i++) {
			// num = input.nextInt();
			num[i] = input.nextInt();

			if (maxNumber < num[i]) {
				maxNumber = num[i];
			}

			if (minNumber > num[i]) {
				minNumber = num[i];
			}
			// System.out.print("This is num"+num);

		}

		System.out.println("The max number is " + maxNumber);
		System.out.println("The min number is " + minNumber);
		// System.out.print("This is num");

	}

}
