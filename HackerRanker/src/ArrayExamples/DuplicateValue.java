package ArrayExamples;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> dupNumber = new HashSet<>();

		int[] number = { 1, 2, 3, 4, 5, 6, 67, 8, 6, 5, 3, 8, 0 };

		for (int i = 0; i < number.length; i++) {
			if (!dupNumber.add(number[i])) {
				System.out.println("Number " + number[i] + " is repeated, ");

			}
			// dupNumber.add(number[i]);

		}
		System.out.println(dupNumber);

	}

}
