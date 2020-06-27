package Practice;

import java.util.Scanner;

public class StairCase {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countNumber = input.nextInt();
		for (int h = 1; h <= countNumber; h++) {
			for (int j = countNumber; j > h; j--) {
				// System.out.print("");//make the size of the stair #
				// #
				// ##
				// ###
				System.out.print(" ");// make the size of the stair
			}
			for (int j = 1; j <= h; j++) {
				// or use int k makes no different
				System.out.print("#");
			}
			System.out.println();// printing in new line
		}
		input.close();
	}

}
