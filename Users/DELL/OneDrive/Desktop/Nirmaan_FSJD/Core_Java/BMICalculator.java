import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in kg");
		double weight = sc.nextDouble();

		System.out.println("Enter height in cm");
		double height = sc.nextDouble();

		double heightInMeters = height / 100;
		double bmi = weight / (heightInMeters * heightInMeters);

		String BMI = String.format("%.2f", bmi);
		System.out.print("Your BMI is " + BMI + ". ");

		if (bmi >= 25) {
			System.out.println("You are overweight");

		} else if (bmi >= 18.5) {
			System.out.println("You are fit and healthy");
		} else {
			System.out.println("You are underweight");

		}

		sc.close();
	}
}
