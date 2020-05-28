package money.management.system;

import java.util.ArrayList;
import java.util.List;

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
		Student Goerge = new Student(11,"Goerge",6);
		Student chu = new Student(11,"Chu",12);
		
		List<Student> studentList= new ArrayList<>();
		
		studentList.add(muhammad);
		studentList.add(Goerge);
		studentList.add(chu);


	}

}
