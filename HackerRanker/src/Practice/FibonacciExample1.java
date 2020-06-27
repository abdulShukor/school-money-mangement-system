
package Practice;

import java.util.Scanner;

public class FibonacciExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 0; i < n; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);

			// System.out.print(n1+""+ n2);
			n1 = n2;
			n2 = n3;
			// System.out.print("VAlue of "+n1+" "+"Value of "+n2+" number of loop iterate"
			// + i);

		}

	}

}
