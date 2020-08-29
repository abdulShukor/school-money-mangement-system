package Search;

public class BinearySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		System.out.println(binearySearch(intArray, 20));
		System.out.println(binearySearch(intArray, -22));
		System.out.println(binearySearch(intArray, 1));

		// must be sorted the array otherwise the method will not work;

	}

	public static int binearySearch(int[] input, int value) {
		int start = 0;
		int end = input.length;

		while (start < end) {
			int midPoint = (start + end) / 2;
			//System.out.println("MidPoint "+ midPoint);
			
			if (input[midPoint] == value) {
				return midPoint;
			}

			else if (input[midPoint] < value) {
				start = midPoint + 1;
			}

			else {
				end = midPoint;
			}
		}
		return -1;
	}

}
