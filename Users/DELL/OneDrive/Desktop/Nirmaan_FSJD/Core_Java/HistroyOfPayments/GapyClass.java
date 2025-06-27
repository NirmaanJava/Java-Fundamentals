package HistroyOfPayments;

import java.util.ArrayList;
import java.util.List;

public class GapyClass implements Gpay {
	double balance;
	List<String> history = new ArrayList<String>();

	public GapyClass(double balance) {
		this.balance = balance;
	}

	public GapyClass() {

	}

	@Override
	public double Checkbalance() {

		return balance;
	}

	@Override
	public void withdraw(int amount) {
		balance -= amount;
		history.add(amount + "withdraw successfully");

	}

	@Override
	public void deposit(int amount) {
		balance += amount;
		history.add(amount + " deposit successfully");
	}

}
