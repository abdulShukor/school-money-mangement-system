package ArrayExamples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sizeOfArray = input.nextInt();
		int numberOFrotation = input.nextInt();
		int array[] = new int[sizeOfArray];
		for (int a_i = 0; a_i < sizeOfArray; a_i++) {
			array[a_i] = input.nextInt();
		}

		for (int i = 0; i < sizeOfArray; i++) {
			final int index = (i + numberOFrotation) % sizeOfArray;
			System.out.print(array[index] + " ");
		}
	}
}

/*Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4*/