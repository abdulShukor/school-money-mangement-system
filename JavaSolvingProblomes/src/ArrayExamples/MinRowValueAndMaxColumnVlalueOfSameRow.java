package ArrayExamples;

public class MinRowValueAndMaxColumnVlalueOfSameRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// remember always that most of the time the logic is inside the nested loop

		int[][] array = { { 7, 4, 9 }, { 90, 1, 3 }, { 5, 66, 2 } };// we initialize array
		int min = array[0][0];// the first value will be 7 here [0][0]=7 is the first row and first coulnm
		// int max= minNumber[0][0];
		int minColumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// if(minNumber[i][j]>max) will print max value from the matrix
				if (array[i][j] < min) {
					min = array[i][j];
					minColumn = j;
				}
			}
		}
		// System.out.print(min);

		int max = array[0][minColumn];
		for (int k = 0; k < 3; k++)

		{
			if (array[k][minColumn] > minColumn) {

				max = array[k][minColumn];

			}
		}
		System.out.print(min + " " + max);
	}

}
