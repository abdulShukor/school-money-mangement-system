package NewChallenges;

import java.util.Scanner;

public class WithArrayBillDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int k = input.nextInt();

		int[] array = new int[n];

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();

			if (array[i] != array[k]) {
				sum += array[i];
			}

		}

		int rest = input.nextInt();
		int t = rest - sum / 2;

		System.out.print(t == 0 ? "Bon Appetit" : t);

	}

}

/*
 * input 4 1 3 10 2 9 12 Expected Output 5 test 2
 * 
 * 4 1 3 10 2 9 7 Expected Output
 * 
 * Bon Appetit
 */
