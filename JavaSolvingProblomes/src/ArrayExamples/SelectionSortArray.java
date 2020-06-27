package ArrayExamples;

public class SelectionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sorting array

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;// every time this will reset when new loop start.
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) { // the less then sign will print array in descending order
					largest = i;
				}

			}

			// System.out.println("large "+largest);

			// System.out.println("checking "+lastUnsortedIndex);
			swap(intArray, largest, lastUnsortedIndex);

		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}

	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;// return nothing
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
