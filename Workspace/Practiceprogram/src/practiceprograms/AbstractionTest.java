package practiceprograms;

/*1.Abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user.
In other words, the user will have the information on what the object does instead of how it does it.

2. Abstraction is achieved using Abstract classes and interfaces.

-- Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )

-- But, if a class has at least one abstract method, then the class must be declared abstract.

-- If a class is declared abstract, it cannot be instantiated.

-- To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.

-- If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.*/

public abstract class AbstractionTest {
	
	private String empName;
	private String position;
	private int income;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		if(income>0)
		this.income = income;
	}

}
