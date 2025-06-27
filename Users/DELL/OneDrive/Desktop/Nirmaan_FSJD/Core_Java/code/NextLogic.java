package code;

public class NextLogic extends Thread {

	public static void main(String[] args) {
		int[] num = { 10, 20, 5, 25, 15 };
		int largest;

		for (int i = 0; i < num.length; i++) {
			System.out.println("Iteration for i " + i);
			for (int j = i + 1; j < num.length; j++) {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Iteration for j " + j);
				if (num[i] > num[j]) {
					// true Block
					System.out.println(num[i] +">" + num[j] +"largest number " + num[i]);
					largest = num[i];

				} else {
					// flase block
					System.out.println(num[i] +">" + num[j] +"largest number " + num[j]);
					
				}
			}

		}

	}

}
