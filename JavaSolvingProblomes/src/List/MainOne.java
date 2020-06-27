package List;

import java.util.LinkedList;

public class MainOne {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Array is not involve each item aware the other item in the list
		// adding to the front of list
		// head and null
		// using list interface and the same methods
		// add method to the end and the add first added to the front of the list
		
		LinkedList<Employee> name = new LinkedList<>();
		name.add(new Employee(100, "Abdul"));
		name.add(new Employee(100, "Muhammd"));
		name.add(new Employee(100, "Zeenat"));
		name.add(3, new Employee(4200, "Subhan"));// add to specific position
		System.out.println(name.set(1, new Employee(500, "Rauf")));
		
//		for (Employee employee : name)// user data type
//		{
//			System.out.println(employee);
//		}
//		System.out.println(name.get(2));
//		System.out.println(name.size());

	}

}
