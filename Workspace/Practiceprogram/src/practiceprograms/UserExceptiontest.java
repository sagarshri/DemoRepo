package practiceprograms;

public class UserExceptiontest {
	
	private double balance;
	private int accNumber;
	
	public double getBalance() {
		return balance;
	}
	
	 public void CheckingAccount(int accNumber) {
	      this.accNumber = accNumber;
	   }
	   
	   public void deposit(double amount) {
	      balance += amount;
	   }
	
	public void withdraw(double amount) {
		try {
			if (amount<=balance) {
				balance -= amount;
			}else{
				double need = amount-balance;
				throw new UserExceptionCreate(need);
			}
		} catch (UserExceptionCreate e) {
			// TODO Auto-generated catch block
			System.out.println("Shortage of...." + e.getAmount());
		}
	}
	
	public int getAccNumber() {
		return accNumber;
	}
	

}
