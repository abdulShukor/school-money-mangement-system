package Practice;

import java.util.Scanner;

//Author Abdul
public class Compare {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// this program is about giving a point to the participant who got higher score.
		// After comparing score the user will get a point
		System.out.println("Please enter Alice and Bob awarding points:");
		int a0 = input.nextInt();
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int b0 = input.nextInt();
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		input.close();
		int a = 0;
		int b = 0;
		if (a0 > b0) {
			a++;
		} else if (b0 > a0) {
			b++;
		}

		if (a1 > b1) {
			a++;
		} else if (b1 > a1) {
			b++;
		}

		if (a2 > b2) {
			a++;
		} else if (b2 > a2) {
			b++;
		}

		System.out.println("Alic got " + a + " points" + " " + "and Bob got " + b);
	}
	// You can anywhere increment a number  like a++ or a-- not just limited to loop
	// Break or continue is not limited to loop you can use it anywhere you need 
	// return is similar to break which jump out of the code block 
	// scan.next(); // returns the next token of input
	// scan.hasNext(); // returns true if there is another token of input (false
	// otherwise)
	// scan.nextLine(); // returns the next LINE of input
	// scan.hasNextLine(); // returns true if there is another line of input

}
