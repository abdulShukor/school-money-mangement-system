package ArrayExamples;

public class UpperTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols;

		// Initialize matrix a
		int a[][] = { { 1, 2, 3}, { 8, 6, 4}, { 4, 9, 6} };

		// Calculates number of rows and columns present in given matrix
		rows = a[0].length;
		cols = a[0].length;
		
		System.out.println(rows+ " " + cols);

		if (rows != cols) {
			System.out.println("Matrix should be a square matrix");
		} else {
			// Performs required operation to convert given matrix into upper triangular
			// matrix
			System.out.println("Upper triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (i > j)
						//if (i < j) Is Lower triangular 
						System.out.print("0 ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();// very important this to print line 
			}
		}
	}
}