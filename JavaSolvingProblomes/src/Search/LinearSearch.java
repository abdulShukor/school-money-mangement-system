package Search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 4, -6, 2, 9, 44 };

		System.out.println("The postion of the value is : " + linearSearch(array, -6));
		System.out.println("The postion of the value is : " + linearSearch(array, 0));
		System.out.println("The postion of the value is : " + linearSearch(array, 44));

	}

	public static int linearSearch(int[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i; // return value is returning the value
				// return i return the position of the element
			}

		}

		return -1;// return need to be in the scope of the loop not inside the loop
	}

}
