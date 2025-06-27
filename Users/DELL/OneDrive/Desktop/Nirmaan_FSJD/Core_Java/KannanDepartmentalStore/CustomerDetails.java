package KannanDepartmentalStore;

public class CustomerDetails implements DoorDelivery, BonusPoints {
	String name;
	long mobileno;
	String StreetName;
	double billAmount;
	int distance;

	public CustomerDetails() {

	}

	public CustomerDetails(String name, long mobileno, String StreetName, double billAmount, int distance) {
		this.name = name;
		this.mobileno = mobileno;
		this.StreetName = StreetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	@Override
	public double calculateBonusPoints(double billAmount) {
		double BonusPoints = 0.0;
		if (billAmount >= 250) {
			BonusPoints = billAmount / 10;
		} else {
			System.out.println("You are not eligible to bonusPoints");
			return 0;
		}
		return BonusPoints;
	}

	@Override
	public double deliveryCharge(int distance) {
		if (distance >= 25) {
			return distance * 8;
		} else if ((distance < 25) && (distance >= 15)) {
			return distance * 5;
		} else if (distance < 15) {
			return distance * 2;
		}
		return distance;
	}

}
