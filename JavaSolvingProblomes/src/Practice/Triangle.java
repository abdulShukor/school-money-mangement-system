package Practice;

import java.util.Scanner;

public class Triangle {

	private static final Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your number:");
		// some time you need nested loop with one inner loop but some time inner
		// can be more then one depend on the problem your are solving it.

		// nested loops works -
		int number = userInput.nextInt();

		int k = 1;
		for (int i = 0; i < number; i++) // (outer for loop) this block will loop for 4 times
		{
			// System.out.println("");
			// System.out.println( "outer loop started");
			for (int j = 1; j <= number - i; j++) // inner loop
			{
				// for (int j = 1; j <= i; j++) {// this will print the other way
				//System.out.print("#");
				System.out.print(k);

				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
