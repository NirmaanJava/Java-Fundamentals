package Threads;

public class Simple extends Thread {

	public static void main(String[] args) {
		for (int i = 0; i <= 5+9; i++) {
			try {
				sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}

}
