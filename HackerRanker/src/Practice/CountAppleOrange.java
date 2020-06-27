package Practice;

import java.util.Scanner;

public class CountAppleOrange {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = input.nextInt();
		int t = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		int m = input.nextInt();
		int n = input.nextInt();
		int[] apple = new int[m];
		int CountNumberOFApple = 0;
		int CountNumberOfOrange = 0;
		for (int i = 0; i < m; i++) {
			apple[i] = input.nextInt();
			if ((a + apple[i] >= s) && (a + apple[i] <= t))
				// System.out.println(""+a);
				CountNumberOFApple++;
		}
		int[] orange = new int[n];
		for (int i = 0; i < n; i++) {
			orange[i] = input.nextInt();
			if ((b + orange[i] >= s) && (b + orange[i] <= t))
				CountNumberOfOrange++;
		}
		System.out.println(CountNumberOFApple);
		System.out.println(CountNumberOfOrange);
		input.close();

	}

	// inputs
	// 7 11
	// 5 15
	// 3 2
	// -2 2 1
	// 5 -6
	// output 1 1
	// Explanation
	// The first apple falls at position 5-2=3 .
	// The second apple falls at position 5+2=7 .
	// The third apple falls at position 5+1=6 .
	// The first orange falls at position 15+5=20 .
	// The second orange falls at position 19-6=9.
	// Only one fruit (the second apple) falls within the region between and , so we
	// print as our first line of output.
	// Only the second orange falls within the region between and , so we print as
	// our second line of output.

}
