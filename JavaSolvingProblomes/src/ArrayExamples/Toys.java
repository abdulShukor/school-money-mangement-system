package ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class Toys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner input = new Scanner(System.in);
//		 int n = input.nextInt();
//		 int k = input.nextInt();
//		 int a[] = new int[n];
//		 for (int i = 0; i < n; i++)
//		 a[i] = input.nextInt();
//		 Arrays.sort(a);
//		 int sum = 0, i = 0;
//		 while (k >= 0 && i < n) {
//		 //System.out.println("K"+k);
//		 //System.out.println("i"+k);
//		
//		
//		 k -= a[i];
//		 //System.out.println(i+" "+k);
//		 if (k < 0)
//		 break;
//		 i++;
//		 }
//		 System.out.println(i);

		Scanner input = new Scanner(System.in);
		int toys = input.nextInt();
		int amount = input.nextInt();

		int[] a = new int[toys];

		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}

		System.out.print(toysBuying(a, amount));

	}

	public static int toysBuying(int[] a, int amount) {
		int max = 0;
		if (a.length == 0 || amount == 0) {
			return max;
		}
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			amount -= a[i];
			if (amount < 0) {
				return max;
			}

			max++;
		}
		return max;
	}
}

/*
 * input (toys 7) (money 50), 1 12 5 111 200 1000 10 Sample Output 4
 * 
 * The first line contains two integers, n and k, the number of priced toys and
 * the amount Mark has to spend.
 * 
 */