package money.management.system;

public class Student {

	/*
	 * Created by ABDUL SHUKOR This class is responsible for keep tracking student
	 * information.
	 */
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	public Student(int id, String name, int grade) {

		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;

	}

	/* we are not going to change student name and id */

	/* This method used to update student's grade */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void updateFeesPaid(int fees) {
		feesPaid += fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public int getGrade() {
		return grade;
	}

	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}

	public String toString() {
		return "Student's name :" + name + " Total fees paid so far $" + feesPaid;
	}

}
