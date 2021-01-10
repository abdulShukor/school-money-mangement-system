package ArrayExamples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			final int index = (i + k) % n;
			System.out.print(a[index] + " ");
		}
	}
}

/*Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4*/