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

			if (a[i] > max) {// i refers here to index position of value
				max = a[i];
			}

			else if (a[i] == max) {

				// very important
				// if put else if then it will not come if else
				// if the first if is true. will execute the if when is true and will not
				// got to the else if in this case
				// the are dependent of each other

				// if (a[i] == max) { if we put anther if instead of else if then it will
				// execute this if regardless of the first if statements
				// now it is independent of each other

				numberOfDublicate++;
			}
		}

		System.out.println("THE MAX NUMBER FROM THE ARRAY LIST IS " + max
				+ ", AND THE NUMBER OF TIMES YOU HAVE ENTER THE SAME VALUE IS " + numberOfDublicate);

	}

}
