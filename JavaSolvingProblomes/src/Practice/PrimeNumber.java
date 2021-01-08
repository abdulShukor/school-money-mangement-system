package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter any number you like : ");
		int userInput = scan.nextInt();
		// int factors = 0; we can reset the value of we declared here
		// and the value will be increment and till the loop end

		for (int i = 1; i <= userInput; i++) {
			int increamentFactors = 0;// every time the inner finished and after outer start new
			// iteration the factor value will get reset back to zero and start inner loop
			// you can start form any number you like just change the i value from to whatever 
			// number you like to start
			for (int k = 1; k <= i; k++) {// want to be efficient the loop. we can put more iterating but it
				// is not necessarily
				if (i % k == 0) {
					increamentFactors++;
				}
			}

			if (increamentFactors == 2) {// if we want to print composite number just change the
				// factors value >2 and it print composite numbers 
				System.out.println("Prime Number:"+i+"\t");
			}
			
//			if (increamentFactors > 2) {
//				System.out.println("Even Number:"+i + "\t");
//			}
		}
		scan.close();

	}

}
