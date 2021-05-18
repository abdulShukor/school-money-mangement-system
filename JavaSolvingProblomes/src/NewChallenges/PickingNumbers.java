package NewChallenges;

import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[100];
		for (int a_i = 0; a_i < n; a_i++) {
			// a[input.nextInt()]++;

			System.out.print(a[input.nextInt()]++);
		}
		int max = 0;
		for (int i = 0; i < 99; i++) {
			max = Math.max(max, a[i] + a[i + 1]);
			System.out.println(" : "+max);

		}
		System.out.println(max);
	}
}
