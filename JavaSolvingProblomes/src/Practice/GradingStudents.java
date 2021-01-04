
package Practice;

import java.util.Scanner;

public class GradingStudents {
	 private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int n = input.nextInt();
//	        for(int k = 0; k < n; k++){
//	            int StudentGrade = input.nextInt();
//	            if (StudentGrade >= 38) {
//	                if (StudentGrade % 5 >= 3) {
//	                    StudentGrade += 5 - (StudentGrade % 5);
//	                }
//	            }
//	            System.out.println(StudentGrade);
//	        }
//	        input.close();
	    	studentGrade1(n);
    

	}
	
	// wrapping in loop the above code
	public static int studentGrade1(int n) {
		int StudentGrade=0;
		for (int k = 0; k < n; k++) {
			StudentGrade = input.nextInt();
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
