package LeetCode;

import java.util.Scanner;

public class TwoSums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int count = sc.nextInt();
        int[] nums = new int[count];

        System.out.println("Enter " + count + " array elements:");
        for (int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the targeted value:");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair found: " + nums[i] + " + " + nums[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found with the given target.");
        }

        sc.close();
    }
}
