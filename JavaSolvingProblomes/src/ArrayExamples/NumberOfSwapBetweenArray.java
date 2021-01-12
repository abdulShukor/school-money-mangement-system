package ArrayExamples;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class NumberOfSwapBetweenArray {

	private static final Scanner input = new Scanner(System.in);

	private static List<Integer> list = new ArrayList<>();

	private static int duplicate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int in = input.nextInt();

		int[] intArray = new int[in];
		int k = 0;
		for (int i = 0; i < in; i++) {
			intArray[i] = input.nextInt();
		}

		int a = minimumSwaps(intArray);

		System.out.print(a);

	}

	static int minimumSwaps(int[] a) {
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			if (i + 1 != a[i]) {
				int t = i;
				
				System.out.print(t);
				while (a[t] != i + 1) {
					t++;
				}
				int temp = a[t];
				a[t] = a[i];
				a[i] = temp;
				swap++;
			}
		}
		return swap;

	}

}

/* Sample Input 1

5
2 3 4 1 5
Sample Output 1*/
