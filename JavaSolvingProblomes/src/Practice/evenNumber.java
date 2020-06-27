package Practice;

import java.util.Scanner;

public class evenNumber {
	 private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter your number:");
        int n = input.nextInt();
        
        for(int i =1;i<n;i++)
        {
        	if(i%2==0)// here we are dealing with i variable inside the loop.
        		// n is just the number till you want iterate it 
        	{
        		System.out.print(i);// we are dealing with i here 
        		System.out.print("\t");
        	}
        }


	}

}
