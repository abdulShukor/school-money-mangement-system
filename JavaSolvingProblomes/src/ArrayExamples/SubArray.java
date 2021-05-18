package ArrayExamples;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt(), sum, ans = 0;
		int[] squares = new int[n];
		for (int squares_i = 0; squares_i < n; squares_i++) {
			squares[squares_i] = input.nextInt();
		}
		int d = input.nextInt();
		int m = input.nextInt();
		for (int i = 0; i < n - m; i++) { // we adding m pairs at inner loop
			sum = 0;

			for (int j = 0; j < m; j++) { // m= number of pairs
				// System.out.print(squares[i+j]);
				sum += squares[i + j];
				// System.out.print("Sum:"+sum);

				if (sum == d)
					ans++;

			}

		}
		System.out.println(ans);
		// your code goes here
	}
}

/*
 * 5 1 2 1 3 2 3 2 Your Output 2
 * 
 * test 2 7 5 2 2 1 5 3 2 9 3 Expected Output 2
 */