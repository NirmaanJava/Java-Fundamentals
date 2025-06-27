package Day5;

public class LeftHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
            // Print spaces first
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
