package Practice;

import java.util.Scanner;

public class SwapTwoNumberWithoutTemVariable {

	private static final Scanner inputValue = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberX = inputValue.nextInt();
		int numberY = inputValue.nextInt();
//		int numberX = 10;
//		int numberY = 20;
		
		System.out.println("Pre-swapping state of the numbers:");
		System.out.println("numberX value: " + numberX);
		System.out.println("numY value: " + numberY);

		System.out.println("");

		numberX = numberX + numberY;
		//System.out.println(numberX);

		numberY = numberX - numberY;
		//System.out.println(numberY);

		numberX = numberX - numberY;
		//System.out.println(numberX);

		System.out.println("Post-swapping state of the numbers:");
		System.out.println("numberX value is: " + numberX);
		System.out.println("numberY value is: " + numberY);
		
		//Using temporary variable
		
		// int temp;
		// int x = 100;
		// int y = 200;
		//
		// //Swapping in steps
		// temp = x;
		// x = y;
		// y = temp;
		//
		// //Verify swapped values
		// System.out.println("x = " + x + " and y = " + y);
		
	}

}
