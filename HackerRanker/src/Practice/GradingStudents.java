
package Practice;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        int n = input.nextInt();
	        for(int k = 0; k < n; k++){
	            int StudentGrade = input.nextInt();
	            if (StudentGrade >= 38) {
	                if (StudentGrade % 5 >= 3) {
	                    StudentGrade += 5 - (StudentGrade % 5);
	                }
	            }
	            System.out.println(StudentGrade);
	        }
	        input.close();

	}

}
