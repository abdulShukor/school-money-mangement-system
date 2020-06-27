package List;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list represent order of sequence data. it is abstract data(interface) it is
		// not concrete
		// data type(implementation)
		// Capacity and size the initial capacity is 10
		// vector is synchronize and threat safe but array list is not

		List<Employee> name = new ArrayList<>();

		name.add(new Employee(100, "Abdul"));
		name.add(new Employee(100, "Muhammd"));
		name.add(new Employee(100, "Zeenat"));

		name.add(new Employee(200, "Subhan"));// add the end of list
		name.add(3, new Employee(4200, "Subhan"));// add to specific position
		System.out.println(name.set(1, new Employee(500, "Rauf")));

		// name.forEach(employee -> System.out.println(employee));
		for (Employee employee : name)// user data type
		{
			System.out.println(employee);
		}
		System.out.println(name.get(2));
		System.out.println(name.size());

	}
}