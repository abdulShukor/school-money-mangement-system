
package Practice;

import java.util.Scanner;

public class PrintNumberOfDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many number you want to check:");

		int n = input.nextInt();
		int maxNumber = 0;
		int sumNumberOfDuplicateValue = 1;
		int numNumber;
		//int [] ArrayDuplicate= new int[n];
		System.out.println("Please enter the numbers you want to check:");

		for (int i = 0; i < n; i++) {
			
			//ArrayDuplicate[i]=input.nextInt();// i here is point to store array in
			// specific index position remember array is sequential
			numNumber = input.nextInt();
			if (numNumber > maxNumber) {
				maxNumber = numNumber;
			} else if (numNumber == maxNumber) {
				sumNumberOfDuplicateValue++;
			}
			
		}
		System.out.println("Max number is :"+maxNumber);
		System.out.println("Number of dublicate value is:"+sumNumberOfDuplicateValue);

	}

}
