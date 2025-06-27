package Static;

public final class StaticKey {
	String AccountHolderName;
	int AccountNumber;
	double Balance;
	double Amount;
	static double interest;

	static {
		interest=9.6;
		System.out.println("this is Static Block");

	}

	public StaticKey() {

	}

	public StaticKey(String AccountHolderName, int AccountNumber, double Balance) {
		this.AccountHolderName = AccountHolderName;
		this.AccountNumber = AccountNumber;
		this.Balance = Balance;
		this.Amount= Balance* interest;
	}

	@Override
	public String toString() {
		return "StaticKey [AccountHolderName=" + AccountHolderName + ", AccountNumber=" + AccountNumber + ", Balance="
				+ Balance + ", Amount=" + Amount + "]";
	}
	

}
