package ATMExample;

import java.util.Scanner;

public class ATMObj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter your PIN: ");
        short PIN = sc.nextShort();

        ATMImplements atm = new ATMImplements(balance);

        System.out.println("Press 1 for Check Balance");
        System.out.println("Press 2 for Withdraw");
        System.out.println("Press 3 for Deposit");
        System.out.println("Press 0 for Exit");
        int option = sc.nextInt();

        switch (option) {
            case 1: {
                atm.CheckBalance(PIN);
                break;
            }
            case 2: {
                System.out.println("Enter the amount to withdraw: ");
                int amount = sc.nextInt();
                atm.withdrawal(amount, PIN);
                break;
            }
            case 3: {
                System.out.println("Enter the amount to deposit: ");
                int amount = sc.nextInt();
                atm.deposit(amount, PIN);
                break;
            }
            case 0: {
                System.out.println("Exiting... Thank you!");
                break;
            }
            default: {
                System.out.println("Choose a correct option!");
                break;
            }
        }
        sc.close();
    }
}
