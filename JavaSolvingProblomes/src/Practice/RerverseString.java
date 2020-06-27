package Practice;

import java.util.Scanner;

public class RerverseString {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// String name= input.nextLine();
		String name = "MOM";

		String check = "";
		if (name == null || name.isEmpty()) {
			System.out.print("There is no string to check or string value is null:");
			return;
			// break;
		}
		for (int i = name.length() - 1; i >= 0; i--) {

			// System.out.print(name.charAt(i));
			check = check + name.charAt(i);
		}
		// System.out.print(check);

		if (name.contentEquals(check)) {
			System.out.print(check + ", is a polindrome word.");
		} else {
			System.out.print(check + ",  is not polindrome.");
		}
	}
	// if you reversing array or string you need -1 from start of a loop
	// Because array and string are zero based
	// return is like break will jump put of the if statement
	// Always initialize any variable your creating is the best practice
	// check for different equal methods for comparing the string
	// Array has length
	// String has length();
	// ArrayList or List has size();
	// Reversing String in loop length()-1 because it is zero index

}
