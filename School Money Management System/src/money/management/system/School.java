package money.management.system;

import java.util.List;

/*Author Abdul Shukor*/


public class School {
	
	private List<Teacher>teachers;
	private List<Student> student;
	private int totalMoneyEarned;
	private int totalMoneySpend;

	public School(List<Teacher> teachers, List<Student> student) {
		this.teachers = teachers;
		this.student = student;
		totalMoneyEarned =0;
		totalMoneySpend=0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}

	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}

	public void setTotalMoneySpend(int totalMoneySpend) {
		this.totalMoneySpend = totalMoneySpend;
	}
	

}
