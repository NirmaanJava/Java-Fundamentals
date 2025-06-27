package code;

public class LargestElement extends Thread {

	public static void main(String[] args) {

		int[] num = { 10, 20, 5, 25, 15 };

		int largestNum = num[0];
		System.out.println(largestNum);
		for (int value : num) {
			System.out.println("iteration for " + value);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (value > largestNum) {
				System.out.println(value + ">" + largestNum + " condition is true");
				largestNum = value;
				System.out.println(largestNum);
			} else {
				System.out.println(value + " " + largestNum + " condition is not true");
			}
		}
		System.out.println(largestNum);
		
		for(int value:num) {
			System.out.println(value);
		}

	}

}
