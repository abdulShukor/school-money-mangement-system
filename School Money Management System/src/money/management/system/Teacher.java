package money.management.system;

public class Teacher {
	
	/*Author Abdul Shukor
	 * 
	 * This class is responsible for keep tracking of teacher information
	 * */
	
	private int id;
	private String name;
	private int salary;
	
	public Teacher (int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary= salary;
	}
	
	public int getId(int id) {
		return id;
	}
	
	public String name(String name)
	{
		return name;
	}
	
	public void setSalary(int salary)
			{
		this.salary= salary;
			}
	
	public int getSalary(int salary) {
		return salary;
	}
	

}