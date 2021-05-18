
package Practice;

import java.util.Scanner;

public class FibonacciExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		fibonacci(n);

		// int n1 = 0;
		// int n2 = 1;
		// int n3;
		// int i;
		// System.out.print(n1 + " " + n2);// printing 0 and 1
		//
		// for (i = 0; i < n; i++)// loop starts from 2 because 0 and 1 are already
		// printed
		// {
		// n3 = n1 + n2;
		// System.out.print(" " + n3);
		//
		// // System.out.print(n1+""+ n2);
		// n1 = n2;
		// n2 = n3;
		// // System.out.print("VAlue of "+n1+" "+"Value of "+n2+" number of loop
		// iterate"
		// // + i);
		//
		// }

	}

	public static void fibonacci(int number) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;// Declaring outside mean you need somewhere else beside loop
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < number; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);

			// System.out.print(n1+""+ n2);
			n1 = n2;// we just printing n3
			n2 = n3;
			// System.out.print("VAlue of "+n1+" "+"Value of "+n2+" number of loop iterate"
			// + i);

		}

	}

}
/*
 * with recursion public static int add(int a) {
 *
 * 
 * if (a == 1 || a == 2) { return 1; } else { return add(a - 1) + add(a - 2); }
 * 
 * }
 */

// using with array
/*
 * int in = input.nextInt();
 * 
 * int [] array= new int[in+1];
 * 
 * array [0]=1; array [1]=1;
 * 
 * for(int i =2;i<in+1;i++) { array[i]=array[i-1]+array[i-2]; }
 * 
 * 
 * for(int i=0;i<in;i++) { System.out.print(array[i]);
 * 
 * }
 */