package Abstraction;

public class PhonepayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phonepe p1 = new BankA(1000);
		p1.makePayment(200);
		p1.makePayment(200);
		System.out.println(p1.Histroy);
		p1.checkBalance();
	}

}
