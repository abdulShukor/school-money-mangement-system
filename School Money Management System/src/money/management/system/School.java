package money.management.system;

import java.util.List;

/*Author Abdul Shukor*/


public class School {
	
	private List<Teacher>teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpend;

	public School(List<Teacher> teachers, List<Student> student) {
		this.teachers = teachers;
		this.students = student;
		totalMoneyEarned =0;
		totalMoneySpend=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
		
	}

	public List<Student> getStudent() {
		return students;
	}

	public void addStudent(Student student) {
		students.add(student);
		
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}

	public void updateTotalMoneySpend(int moneySpend) {
	totalMoneySpend-=moneySpend;
	}
	

}
