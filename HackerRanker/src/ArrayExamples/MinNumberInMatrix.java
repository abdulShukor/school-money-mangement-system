package ArrayExamples;

public class MinNumberInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] minNumber = { { 7, 4, 6 }, { 90, 80, 3 }, { 10, 40, 2 } };// we initialize array
		int min = minNumber[0][0];// the first value will be 8 here [0][0]=8 is the first row and first coulnm
		// int max= minNumber[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// if(minNumber[i][j]>max) will print max value from the matrix
				if (minNumber[i][j] < min) {
					min = minNumber[i][j];
				}
			}
		}
		System.out.print(min);

	}

}
