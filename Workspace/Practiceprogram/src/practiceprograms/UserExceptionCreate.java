package practiceprograms;


//User-defined Exceptions -  We can create our own exception in Java.
//1. All exceptions must be a child of Throwable.
//2. If you want to write a checked exception then you need to extend the Exception class.
//3. If you want to write a runtime exception, you need to extend the RuntimeException class.


public class UserExceptionCreate extends Exception{
     private double amount;
	 public UserExceptionCreate(Double amount) {
		this.amount=amount;
	}
	 
	 public double getAmount() {
		return amount;
	}
	
}
