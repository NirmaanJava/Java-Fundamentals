package Day6;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        final int PIN = 1234;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        while (attempts < 3) {
            System.out.print("Enter the PIN: ");
            int userPin = sc.nextInt();

            if (userPin == PIN) {
                System.out.println("Successfully Logged In");
                break; // Exit loop on success
            } else {
                attempts++;
                System.out.println("Invalid PIN. Attempts left: " + (3 - attempts));
            }
        }

        if (attempts == 3) {
            System.out.println("Account locked due to 3 incorrect attempts.");
        }

        sc.close();
    }
}
