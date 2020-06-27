package Practice;

//Author Abdul Shukr
import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program is about meeting the user target:
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your target number:");

		int length = input.nextInt();
		int sum = 0;
		int number = 0;

		for (int i = 0; i < length; i++) {
			sum += input.nextInt();
			number++;
			if (sum >= length) {
				System.out
						.println("The target is " + sum + "" + " ,and it took " + number + " numbers  to the target:");

				break;

			}
		}
		input.close();

	}

}
