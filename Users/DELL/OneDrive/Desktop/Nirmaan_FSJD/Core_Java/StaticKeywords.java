
public class StaticKeywords {
	String AccountHolderName;
	long AccountNumber;
	int balance;
	double amount;

	static double interest ;
	static {
		interest= 7.9;
	}

	public StaticKeywords(String accountHolderName, long accountNumber, int balance) {
		AccountHolderName = accountHolderName;
		AccountNumber = accountNumber;
		this.balance = balance;
		this.amount= balance*interest;
	}

	public StaticKeywords() {
	}

	@Override
	public String toString() {
		return "AccountHolderName=" + AccountHolderName + ", AccountNumber=" + AccountNumber
				+ ", balance=" + balance + ", Amount="+ amount;
	}

}
