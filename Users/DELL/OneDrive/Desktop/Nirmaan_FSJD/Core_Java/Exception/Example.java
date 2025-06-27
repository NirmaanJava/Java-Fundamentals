package Exception;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Exception class");
		try {
			int a = 10 / 10;
		} catch (Exception E) {
			System.out.println(E);
		} finally {
			System.out.println("this is finally block");
		}
		System.out.println("compiler time exception");

		System.out.println("runtime exception");

	}

}
