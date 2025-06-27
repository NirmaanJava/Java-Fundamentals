package KannanDepartmentalStore;

import java.util.Scanner;

public class KannanDepartmentalStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Name:");
		String Cname = sc.nextLine();
		System.out.println("Enter the Mobile Name:");
		Long Cnumber = sc.nextLong();
		System.out.println("Enter the Street Name:");
		String CStreetName = sc.next();
		System.out.println("Enter the Bill Amount:");
		double CBillAmount = sc.nextDouble();
		System.out.println("Enter the Distance:");
		int CDistance = sc.nextInt();

		CustomerDetails customer1 = new CustomerDetails(Cname, Cnumber, CStreetName, CBillAmount, CDistance);
		System.out.println("Bonus Points ="+customer1.calculateBonusPoints(CBillAmount));
		System.out.printf("DeliveryCharge ="+"%.2f",customer1.deliveryCharge(CDistance));
	}

}
