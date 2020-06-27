package Practice;

//Author Abdul
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {

	// This method is doing addition of ArrayList.
	private static List<Integer> sumTheArray = new ArrayList<>();
	private static final Scanner inputValue = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter your array numbers :\n");
		int amount = inputValue.nextInt();
		long sum = 0;
		for (int i = 0; i < amount; i++) {
			sumTheArray.add(inputValue.nextInt());
		}

		for (int a : sumTheArray) {
			sum += sumTheArray.get(a);
		}

		System.out.println(sum);

		inputValue.close();

	}

	/*
	 * second same problem but with different for loop structure.
	 * System.out.println("Please enter your number:\n");
	 *  int amount =input.nextInt(); 
	 *  long sum = 0;
	 *   for(int count = 0; count < amount; count++) {
	 * arraySum.add(input.nextInt()); } 
	 * 
	 * for(int a = 0; a < arraySum.size(); a++)
	 *  {
	 * sum += arraySum.get(a); }
	 *  System.out.println(sum);
	 *   input.close();
	 * }
	 */

	
	/*
	 * This is the third method for the same problem but different approach.
	 * 
	 * Scanner inputValue = new Scanner(System.in); 
	 * int lengthOfInput = inputValue.nextInt(); 
	 * long sum = 0;
	 * 
	 * for(int i = 0; i < lengthOfInput; i++) { sum += inputValue.nextInt(); }
	 * 
	 * System.out.println(sum); }
	 */
	
	
	// Fourth method with hard coded 
	// int[]b= {1,2,3,4,5};
			// sumNumebr(b);

			// Scanner input = new Scanner(System.in);
			// int length = input.nextInt();
			// int sum = 0;
			//
			// for(int i = 0; i < length; i++) {
			// sum += input.nextInt();
			// }
			//
			// System.out.println(sum);
			// }
}
