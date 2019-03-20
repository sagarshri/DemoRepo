package practiceprograms;


/*Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together 
as a single unit. In encapsulation, the variables of a class will be hidden from other classes,
and can be accessed only through the methods of their current class. 
Therefore, it is also known as Data Hiding.
*/
public class EncaptulationTest {
	 
	private String empName;
	private String designation;
	private int salary;
	private int grossSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary>0)
		this.salary = salary;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int salary) {
		if (salary>0)
			salary = salary + 1000;
		this.grossSalary = salary;
	}
	
	

}
