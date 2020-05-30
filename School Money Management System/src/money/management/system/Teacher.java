package money.management.system;

public class Teacher {

	/*
	 * Author Abdul Shukor
	 * 
	 * This class is responsible for keep tracking of teacher information
	 */

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}

	public int getId(int id) {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpend(salary);
	}

	public String toString() {
		return "Teacher's name :" + name + " " + "Total salary earned so far $" + salaryEarned;
	}

}
