package Practice;

import java.util.Scanner;

public class DoBigSum {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sum of a very big number
		int input = scanner.nextInt();
		long sum = 0;

		// while (N-- > 0) {
		// sum += scanner.nextInt();
		// }
		// System.out.println(sum);
		
		
		// for (int i = N; i >= 1; i--) {
		// sum += scanner.nextInt();
		// }
		// System.out.println(sum);
		

		for (int i = 1; i <= input; i++) {
			sum += scanner.nextInt();
		}
		System.out.println(sum);

	}

}
