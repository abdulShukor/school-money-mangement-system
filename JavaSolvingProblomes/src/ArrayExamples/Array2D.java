package ArrayExamples;

import java.util.Scanner;

public class Array2D {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner input = new Scanner(System.in);
		int[][] intArray = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				intArray[i][j] = input.nextInt();
			}
		}

		int maxInt = Integer.MIN_VALUE;
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 4; l++) {
				int firstRowColunmLine = intArray[k][l] + intArray[k][l + 1] + intArray[k][l + 2];
				int secondRowColunmLine = intArray[k + 1][l + 1];
				int thirdRowColunmLine = intArray[k + 2][l] + intArray[k + 2][l + 1] + intArray[k + 2][l + 2];
				int sum = firstRowColunmLine + secondRowColunmLine + thirdRowColunmLine;
				if (sum > maxInt)
					maxInt = sum;
			}
		}
		System.out.print(maxInt);
	}
}

	/* 	1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
	Sample Output
	
	19*/


/*		-9 -9 -9  1 1 1 
 		0 -9  0  4 3 2
		-9 -9 -9  1 2 3
 		0  0  8  6 6 0
 		0  0  0 -2 0 0
 		0  0  1  2 4 0
		The 16 hourglass sums are:

		-63, -34, -9, 12, 
		-10,   0, 28, 23, 
		-27, -11, -2, 10, 
  		9,  17, 25, 18
The highest hourglass sum is 28 from the hourglass beginning at row , column :

		0 4 3
		  1
	    8 6 6*/
