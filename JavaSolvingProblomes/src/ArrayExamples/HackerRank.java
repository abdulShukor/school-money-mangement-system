package ArrayExamples;

import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
			int n = input.nextInt();
			int[] arr = new int[n];
			int[] actual = new int[n];
			boolean chaotic = true;
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt() - 1;
				actual[arr[i]] = i;
				if (i - arr[i] < -2)
					chaotic = false;
			}

			int count = 0;
			if (!chaotic)
				System.out.println("Too chaotic");
			else {
				for (int i = 0; i < n; i++) {
					if (i != arr[i]) {
						for (int j = actual[i]; j > i; j--) {
							arr[j] = arr[j - 1];
							actual[arr[j - 1]] = j;
							count++;
						}
						arr[i] = i;
					}
				}
				System.out.println(count);
			}
		}
	}
}

	/* Sample Input

	2
	5
	2 1 5 3 4
	5
	2 5 1 3 4
	Sample Output

	3
	Too chaotic*/