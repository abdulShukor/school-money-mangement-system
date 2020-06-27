package Practice;

import java.util.Scanner;

public class Traingle1 {
	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("Enter the number of rows to be printed"); 
        int rowsNumber = input.nextInt(); 
  
        // loop to iterate for the given number of rows . it also important to know how many time you want
        // Increment a loop. like 1,3,5,7,9 or 1,2,3,4,5,6
        for (int i = 1; i <= rowsNumber; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rowsNumber; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        } 
    } 

}
