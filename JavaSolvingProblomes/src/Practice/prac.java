package Practice;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class prac {

	private static final Scanner inputValue = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = inputValue.nextInt();
		
		
		
		
	}
	public static int studentGrade1(int n) {
		int StudentGrade=0;
		for (int k = 0; k < n; k++) {
			StudentGrade = inputValue.nextInt();
			if (StudentGrade >= 38) {
				if (StudentGrade % 5 >= 3) {
					StudentGrade += 5 - (StudentGrade % 5);
				}
			}
			System.out.println(StudentGrade);
			// return StudentGrade;


		}
		// input.close();
		return StudentGrade;
	
	}
	

}
