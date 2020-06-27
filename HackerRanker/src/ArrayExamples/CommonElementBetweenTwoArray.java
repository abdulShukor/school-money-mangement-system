package ArrayExamples;

public class CommonElementBetweenTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 1, 2, 8, 0, 7, 9, 4 };

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < b.length; k++) {
				if (a[i] == b[k]) {
					System.out.println("This number is common between the to array:" + a[i]);
					break;
				}
			}
		}

	}

}
