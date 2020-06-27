package Practice;

import java.util.Scanner;

public class PrintNumberOfDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int maxNumber = 0;
		int sumNumberOfDuplicateValue = 1;
		int numNumber;
		//int [] ArrayDuplicate= new int[n];
		for (int i = 0; i < n; i++) {
			
			//ArrayDuplicate[i]=input.nextInt();
			numNumber = input.nextInt();
			if (numNumber > maxNumber) {
				maxNumber = numNumber;
			} else if (numNumber == maxNumber) {
				sumNumberOfDuplicateValue++;
			}
		}
		System.out.println(sumNumberOfDuplicateValue);

	}

}
