package Day6;

import java.util.Scanner;

public class Oxygen {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the room(in m)");
        double length = sc.nextDouble();
        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.println("Enter the breadth of the room(in m)");
        double breadth = sc.nextDouble();
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        System.out.println("Enter the plant area of a single plant(in cm2)");
        double plantAreaCm = sc.nextDouble();
        if (plantAreaCm <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        double roomArea = length * breadth;
        double plantAreaM = plantAreaCm / 10000.0;

        int plants = (int)(roomArea / plantAreaM);

        double oxygen = plants * 0.9;

        System.out.println("Total number of plants is " + plants);
        System.out.printf("Total oxygen production is %.2f litres\n", oxygen);

        sc.close();
    }
}
