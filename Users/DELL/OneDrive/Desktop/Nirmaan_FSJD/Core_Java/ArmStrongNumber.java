import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int result = 0;
        int digit;

        int numberOfDigits = String.valueOf(number).length(); // Count of digits

        while (number != 0) {
            digit = number % 10;
            result += Math.pow(digit, numberOfDigits); // Raise digit to the power of number of digits
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
