package practiceprograms;


//1. If you want the actual implementation of that method to be determined by child classes, declare method as Abstract in parent class
//2. abstract method contains a method signature, but no method body
//3. class containing it must be declared as abstract.
//4. Any class inheriting the abstract class must either override the abstract method or declare itself as abstract.

public abstract class AbstractMethodtest {

	private String worker;
	
	public abstract double monthlySalary(int x) ;
	
}
