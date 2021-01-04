package ArrayExamples;

public class DoublyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first is row second is column
		// first row has three column
		/*
		 * 2 4 5 
		 * 3 4 1 
		 * 5 2 1
		 */

		int[][] array = new int[3][3]; // just Allocating the size 

		array[0][0] = 2;
		array[0][1] = 4;
		array[0][2] = 5;
		array[1][0] = 3;
		array[1][1] = 4;
		array[1][2] = 1;
		array[2][0] = 5;
		array[2][1] = 2;
		array[2][2] = 1;

		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[i][k] + "\t");

			}
			System.out.println();

		}

	}

}
