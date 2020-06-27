package ArrayExamples;

import java.util.Scanner;

public class MinAndMaxElementInArray {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [] n = {1,2,3,4,5,6,7,8,9};

		int n = input.nextInt();

		int maxNumber = 0;
		int minNumber = 10;// we coming down // or we can ask form a user input.nextInt();
		int[] num = new int[5];
		// int num;

		for (int i = 0; i < n; i++) {
			// num = input.nextInt();
			num[i] = input.nextInt();

			if (maxNumber < num[i]) {// i is referring the value related to the index
				maxNumber = num[i];
			}

			if (minNumber > num[i]) {
				minNumber = num[i];// this is in and the value of minNumber will be changed every time new loop
									// starts
			}
			// System.out.print("This is num"+num);

		}

		System.out.println("The max number is " + maxNumber);
		System.out.println("The min number is " + minNumber);
		// System.out.print("This is num");

	}

}
