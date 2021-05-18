package cpc616;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testing small = new testing();
		int arr[] = { 0,2,4,6,8,9};
		int n = arr.length;
		System.out.println("First Missing element is : " + small.findFirstMissing(arr, 0, n - 1));
	}

	int findFirstMissing(int array[], int start, int end) {
		

		if (start != array[start])
			return start;

		int mid = (start + end) / 2;

		// Left half has all elements from 0 to mid
		if (array[mid] == mid)
			return findFirstMissing(array, mid + 1, end);

		return findFirstMissing(array, start, mid);
	}
}
