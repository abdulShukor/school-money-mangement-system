package Practice;

import java.util.Scanner;

public class TheHighestNumberFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] a = new int[n];
		int max = 0;
		int numberOfDublicate = 1;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();

			if (a[i] > max) {
				max = a[i];
			}

			else if (a[i] == max) {
				numberOfDublicate++;
			}
		}

		System.out.println("THE MAX NUMBER FROM THE ARRAY LIST IS " + max
				+ ", AND THE NUMBER OF TIMES YOU HAVE ENTER THE SAME VALUE IS " + numberOfDublicate);

	}

}
