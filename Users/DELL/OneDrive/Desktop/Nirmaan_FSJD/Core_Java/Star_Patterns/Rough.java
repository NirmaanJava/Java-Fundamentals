package Star_Patterns;

public class Rough {
	public static void main(String[] args) {
//		byte a=-12;
//		int b;
//		b=a<<4;
//		System.out.println(b);
//		System.out.println((byte)b);
		for (int i = 0; i < 10; i++) {
			
			for(int k=1; k<10-i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
