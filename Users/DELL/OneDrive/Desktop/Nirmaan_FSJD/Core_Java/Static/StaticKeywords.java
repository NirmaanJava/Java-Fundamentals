package Static;

public class StaticKeywords {
	String accountHolderName;
	long accountNumber;
	int balance;
	double amount;

	// Static variable
	static double interest;

	// Static block to initialize static variable
	static {
		interest = 7.9;
	}

	// Parameterized constructor
	public StaticKeywords(String accountHolderName, long accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = balance * interest; // interest calculation
	}

	// Default constructor
	public StaticKeywords() {
	}

	@Override
	public String toString() {
		return "AccountHolderName = " + accountHolderName +
				", AccountNumber = " + accountNumber +
				", Balance = " + balance +
				", Amount = " + amount;
	}
}
