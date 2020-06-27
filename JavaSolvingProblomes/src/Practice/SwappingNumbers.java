
package Practice;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputValue = new Scanner(System.in);

		System.out.print("Please enter your numbers for swapping are ");

		int number1 = inputValue.nextInt();
		int number2 = inputValue.nextInt();

		System.out.println("Number before swapping are " + number1 + " and " + number2);

		swap(number1, number2);

	}

	public static void swap(int number1, int number2) {
		if (number1 == number2) {
			return;
		}
		int temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Number after swapping " + number1 + " and " + number2);

	}

}
