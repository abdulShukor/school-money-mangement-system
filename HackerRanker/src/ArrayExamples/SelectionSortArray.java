package ArrayExamples;

public class SelectionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sorting array

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}

			}
			swap(intArray, largest, lastUnsortedIndex);

		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}

	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
