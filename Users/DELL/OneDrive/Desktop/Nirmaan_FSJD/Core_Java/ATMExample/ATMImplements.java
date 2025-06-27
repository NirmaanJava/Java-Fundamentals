package ATMExample;

public class ATMImplements implements ATMOperation {
	double balance;
	int Pin = 1234;
	@Override
	public void deposit(double amount, int PIN) {
		if (Pin == PIN) {
			balance += amount;
		} else {
			System.out.println("enter the Correct Pin");
		}

	}

	@Override
	public void withdrawal(int amount, int PIN) {
		if (Pin == PIN) {
			if (balance > amount) {
				balance -= amount;
			} else {
				System.out.println("insufficient Balance");
			}
		} else {
			System.out.println("enter the Correct Pin");
		}
//		

	}

	public ATMImplements() {

	}

	public ATMImplements(double a) {
		this.balance = a;
	}

	@Override
	public void CheckBalance(int PIN) {
		if(this.Pin==PIN) {
			System.out.println(balance);
		} else {
			System.out.println("Enter the Correct Pin...");
		}
		
	}

}
