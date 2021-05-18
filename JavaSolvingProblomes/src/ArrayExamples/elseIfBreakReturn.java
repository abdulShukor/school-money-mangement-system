package ArrayExamples;

import java.util.Scanner;

public class elseIfBreakReturn {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Here we are trying t find two highest number if we have two if and if then
		 * we will print twice the highest number to overcame the problem we need to use
		 * else if the the Second highest number then we achieve our goal. remember if
		 * is not the same as else if
		 */
		/*
		 * 2. also remember the break if not the same as return. break will jump out of
		 * the current loop and the return will jump out of the loops
		 */

		/* 3. int [] array= new int[i++], [i+1], [i-1],[i]++,a[input.nextInt();]++*/

		/*
		 * 4. if you do not put else after if then if if get true then will also execute
		 * after the if 5. if you are doing the modules if the the a>b the will print the
		 * a. example 5%4 will return 5
		 */

		int n = input.nextInt();
		// int d = input.nextInt();

		int max = 0;
		int min = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {

			int nn = input.nextInt();

			if (nn > max) {

				min = max;
				max = nn;

			}

			else if (nn > min) {
				min = nn;
				// will print the first and second highest number
			}

			// if (nn > min) {
			// min = nn;
			// will print times the highest number
			// }

		}

		System.out.print(max + " : " + min);

	}
}
