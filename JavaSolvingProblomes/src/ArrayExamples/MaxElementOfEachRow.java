package ArrayExamples;

import java.util.Scanner;

public class MaxElementOfEachRow {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of rows and columns in the matrix: ");
		int row = input.nextInt();
		int col = input.nextInt();
		// Prepare matrix
		int[][] matrix = prepareMatrix(row, col);
		findMaxInEachRow(matrix);// sending method as method argument
		input.close();
	}

	// Method to enter matrix elements
	private static int[][] prepareMatrix(int row, int column) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of Matrix : ");
		int matrix[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// displaying matrix
		System.out.println("Entered Matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(" " + matrix[i][j] + "\t");
			}
			System.out.println();
		}
		return matrix;
	}

	// Method to find the maximum element in each row
	private static void findMaxInEachRow(int[][] matrix) {
		int[] tempArray = new int[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			// Start with first element of the row
			int max = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
				tempArray[i] = max;
			}
		}
		// Displaying max elements
		for (int i = 0; i < tempArray.length; i++) {
			System.out.println("Maximum element in row-" + (i + 1) + " = " + tempArray[i]);
		}
	}
}
