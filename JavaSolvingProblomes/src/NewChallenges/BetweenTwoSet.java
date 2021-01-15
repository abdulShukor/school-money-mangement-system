package NewChallenges;

import java.util.Scanner;

public class BetweenTwoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int numberOne = in.nextInt();
		int numberTwo = in.nextInt();
		int[] a = new int[numberOne];
		for (int a_i = 0; a_i < numberOne; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[numberTwo];
		for (int b_i = 0; b_i < numberTwo; b_i++) {
			b[b_i] = in.nextInt();
		}

		int c = 0;
		for (int i = 1; i < 101; i++) {
			int k = 0;
			for (int j = 0; j < numberOne; j++) {
				if (i % a[j] == 0) {
					k++;
				}
			}

			for (int j = 0; j < numberTwo; j++) {
				if (b[j] % i == 0) {
					k++;
				}
			}

			if (k == numberTwo + numberOne) {
				c++;
			}
		}

		System.out.println(c);
	}
}
/*Sample Input

	2 3
	2 4
	16 32 96
	Sample Output 3

*/