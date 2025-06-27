package Abstraction;

import java.util.Date;

public class BankA extends Phonepe {

	public BankA(double initialAmount) {
		super(initialAmount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void makePayment(double amount) {
		if (this.initialAmount > amount) {
			System.out.println("You Have sufficient balance");
			initialAmount -= amount;
			this.Histroy.add("Successfully Done Payment amount is" + amount);
		} else {
			System.out.println("You have insuffficient balance");
		}

	}

	@Override
	void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current Balance: " + initialAmount);

	}

}
