package practiceprograms;



public class AbstractionTestMain extends AbstractionTest{
	
	private String department;
	
	public String getDepartment() {
		//System.out.println(department);
		return department;
	}

 	public void setDepartment(String department) {
		this.department = department;
		//System.out.println("Calling setDepartment");
	}

	
}
