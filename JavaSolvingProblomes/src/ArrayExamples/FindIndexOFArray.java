package ArrayExamples;

public class FindIndexOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Data Structure is a way to organize and store data
		// Algorithm is steps to do a specific job
		// Time complexity, memory complexity
		// Array is contiguous block that store the same data type and each element of
		// the is occupying same amount of memory

		// How to find the index of element of array without knowing how the store

		int[] myArray = { 1, 2, 6, 60, 5, 3, 90, 200, 500 };
		int index = -1;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == 200) {
				index = i;
				break;
			}
		}
		System.out.println("index = " + index);
		

	}

}
