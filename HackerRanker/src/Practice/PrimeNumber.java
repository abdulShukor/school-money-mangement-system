package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			int factors = 0;
			int j = 1;

			while (j <= i) {
				if (i % j == 0) {
					factors++;
				}
				j++;
			}
			if (factors == 2) {
				System.out.println(i);
			}
		}
		scan.close();

	}

	// int input = scanner.nextInt();
	// if (isPrime(input)) {
	// System.out.println(input + " is a prime number");
	// } else {
	// System.out.println(input + " is not a prime number");
	// }
	// scanner.close();
	// }
	//
	// public static boolean isPrime(int number) {
	// if (number <= 1) {
	// // System.out.println(n + " is not a prime number");
	//
	// return false;
	// }
	//
	// for (int i = 2; i < Math.sqrt(number); i++) {
	// if (number % i == 0) {
	//
	// return false;
	// }
	// }
	// return true;
	//
	// }
	// second
	// Scanner s = new Scanner(System.in);
	// System.out.print("Enter the first number : ");
	// int start = s.nextInt();
	// System.out.print("Enter the second number : ");
	// int end = s.nextInt();
	// System.out.println("List of prime numbers between " + start + " and " + end);
	// for (int i = start; i <= end; i++) {
	// if (isPrime(i)) {
	// System.out.println(i);
	// }
	// }

}
