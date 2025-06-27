package MetroTickets;
import java.util.Scanner;

public class ChennaiMetroInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetroTicket ticket = new MetroTicket();

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Scan Entry");
            System.out.println("2. Scan Exit");
            System.out.println("3. Exit Program");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ticket.scanEntry();
                    break;
                case 2:
                    ticket.scanExit();
                    break;
                case 3:
                    System.out.println("👋 Exiting. Thank you!");
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
