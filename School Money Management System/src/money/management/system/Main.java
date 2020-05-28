package money.management.system;

import java.util.ArrayList;
import java.util.List;
/*Author Abdul Shukor*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher abdul = new Teacher(100,"Abdul",500);
		Teacher mike = new Teacher(110,"Mike",700);
		Teacher zeenat = new Teacher(120,"Zeenat",900);
		
		List <Teacher> teacherList= new ArrayList<>();
		
		teacherList.add(abdul);
		teacherList.add(mike);
		teacherList.add(zeenat);
		
		Student muhammad = new Student(10,"Muhammad",4);
		Student goerge = new Student(11,"Goerge",6);
		Student chu = new Student(11,"Chu",12);
		
		List<Student> studentList= new ArrayList<>();
		
		studentList.add(muhammad);
		studentList.add(goerge);
		studentList.add(chu);
		
		School centennial = new School(teacherList,studentList);
		muhammad.payFees(3000);
		goerge.payFees(5000);
		System.out.println("Centennial has earned $"+""+ centennial.getTotalMoneyEarned());
		
		System.out.println("-----Making Centennial pay salary-----");
		
		abdul.receiveSalary(abdul.getSalary());
		System.out.println("Centennial pay salary to " +abdul.getName()+" and now has $"+
		centennial.getTotalMoneyEarned());

		



	}

}