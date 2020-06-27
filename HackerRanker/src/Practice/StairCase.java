package Practice;

import java.util.Scanner;

public class StairCase {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countNumber = input.nextInt();
		for (int h = 1; h <= countNumber; h++) {
			for (int j = countNumber; j > h; j--) {
				System.out.print("+");
				
			}
			for (int j = 0; j < h; j++) {
				// or use int k makes no different 
				System.out.print("#");
			}
			System.out.println();
		}
		input.close();
	}

	//int countNumber = scanner.nextInt();
	//
	// for (int h = 1; h < countNumber; h++) {
	// // System.out.println(k);
	// System.out.println();
	//
	// for (int i = countNumber; i > h; i--) {
	// // System.out.println(j);
	// System.out.print(" ");
	// }
	//
	// for (int j = 0; j < h; j++) {
	// System.out.print("#");
	//
	// }
	//
	// }
	// scanner.close();

}
