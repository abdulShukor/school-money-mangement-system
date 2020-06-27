package ArrayExamples;

import java.util.Scanner;

public class FirstSecondLArgestNumber {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstLargestnumber = 0;
		int secondLargestnumber = 0;
		int inputUser = 0;

		System.out.println("Enter numbers");
		int n = input.nextInt();// number of loop iteration
		for (int i = 0; i < n; i++) {
			// user input
			inputUser = input.nextInt();
			// for array you need inputUser[i]
			if (firstLargestnumber < inputUser) {
				secondLargestnumber = firstLargestnumber;
				firstLargestnumber = inputUser;

			} else if (secondLargestnumber < inputUser) {
				secondLargestnumber = inputUser;
			}

		}
		System.out.println("First largest number is  " + firstLargestnumber + " , and second largest number is "
				+ secondLargestnumber);


	}
}
