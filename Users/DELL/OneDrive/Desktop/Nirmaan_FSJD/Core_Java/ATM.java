import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		while (count < 3) {

			System.out.println("Enter the User ATM Pin:");
			int MyPin = sc.nextInt();
			if (pin == MyPin) {
				// true block
				System.out.println("Your Pin is correct");
				break;
			} else {
				// false block
				System.out.println("Pin is Wrong...");
				count++;
			}
			

		}
		if(count==3) {
			System.out.println("Your Account is Locked...");
		}

	}

}
