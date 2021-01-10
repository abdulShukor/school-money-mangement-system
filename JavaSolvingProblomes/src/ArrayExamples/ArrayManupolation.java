package ArrayExamples;

import java.util.Scanner;

public class ArrayManupolation {
	public static void main(String zargs[]) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();

		long[] a = new long[n + 2];

		while (m--> 0) {
			int xRows = input.nextInt();
			int yCol = input.nextInt();
			long value = input.nextLong();

			a[xRows] += value;
			a[yCol + 1] -= value;
		}

		long max = 0, curr = 0;

		for (int i = 0; i <= n + 1; i++) {
			curr += a[i];
			// System.out.println(curr);
			if (curr > max)
				max = curr;
		}

		System.out.println(max);
	}
}

/*Sample Input

5 3
1 2 100
2 5 100
3 4 100
Sample Output

200
Explanation

After the first update the list is 100 100 0 0 0.
After the second update list is 100 200 100 100 100.
After the third update list is 100 200 200 200 100.

The maximum value is 200*/
