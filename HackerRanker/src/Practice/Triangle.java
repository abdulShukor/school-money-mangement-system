package Practice;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested loops works -
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int k = 1;
		for (int i = 0; i < n; i++) // (outer for loop) this block will loop for 4 times
		{
			//System.out.println("");
			//System.out.println( "outer loop started");
			for (int j = 1; j <= n-i; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}
//	int k=1;
//	  int j=1;
//	 for (int i = 1; i <n; i++) {
//	 for (j = 1; j <= i; j++) {
//	 System.out.print(k++);
//	 System.out.print("\t");
//	 
//	 }
//	 System.out.println("");
//	
//	 }
//	}

}
