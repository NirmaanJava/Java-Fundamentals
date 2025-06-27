package ATMExample;

public interface ATMOperation {
	

	public void deposit(double amount, int PIN);

	public void withdrawal(int amount, int PIN);
	
	public void CheckBalance(int PIN);

}
