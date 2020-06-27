package ArrayExamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayWithoutDuplicateValue {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 1, 3, 7, 7, 8, 9, 9, 9, 10,10, 7, 9 };
		Arrays.sort(input);// it sort the array but not remove the duplicate values
		// It will sort like 1,1,3,7,7,7,8,9,9,9,10
		// for printing the array you need to loop it. you cannot print it with the
		// method System.out.print(input);

		int current = input[0];// the first valve will be 1 from the array list
		// boolean found = false;
		for (int i = 0; i < input.length; i++) {
			  if (current != input[i]) {
				System.out.print(" " + current);
				current = input[i];
				// found = false;
			}
		}
		System.out.print(" " + current);// printing the last valve
	}

}
