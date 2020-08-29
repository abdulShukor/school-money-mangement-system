package ArrayExamples;

import java.util.Scanner;

public class AddingMatrix {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfRows;
		int numnerOfColumns;
		System.out.println("Enter number of rows");
		numberOfRows = input.nextInt();
		System.out.println("Enter number of columns");
		numnerOfColumns = input.nextInt();
		int Matrix1[][] = new int[numberOfRows][numnerOfColumns];// size of the array 
		int Matrix2[][] = new int[numberOfRows][numnerOfColumns];
		int resultMatrix1[][] = new int[numberOfRows][numnerOfColumns];

		// getting the user input for first matrix
		System.out.println("Enter elements of first matix:");
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				Matrix1[i][j] = input.nextInt();
			}
		}

		// displaying the first matrix elements
		System.out.println("First Matrix is");

		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				System.out.print(" " + Matrix1[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println("Enter elements of second matix:");
		// getting the user input for second matrix

		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				Matrix2[i][j] = input.nextInt();
			}
		}

		// displaying the first matrix elements
		System.out.println("second Matrix is");
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				System.out.print(" " + Matrix2[i][j] + "\t");

			}
			System.out.println();// new line every time the outer loop start

		}
		// Adding matrix
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				resultMatrix1[i][j] = Matrix1[i][j] + Matrix2[i][j];
			}
		}
		// printing the result of added matrix
		System.out.println("Result of matrix:");
		for (int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < numnerOfColumns; j++) {
				System.out.print(" " + resultMatrix1[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
