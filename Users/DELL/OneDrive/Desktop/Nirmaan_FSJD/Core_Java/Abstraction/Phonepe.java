package Abstraction;

import java.util.ArrayList;
import java.util.List;

public abstract class Phonepe {
	double initialAmount;
	protected List<String> Histroy = new ArrayList<String>();

	abstract void makePayment(double amount);

	abstract void checkBalance();

	void commonFeature() {

	}

	public Phonepe(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public Phonepe() {
		super();
	}
	

}
