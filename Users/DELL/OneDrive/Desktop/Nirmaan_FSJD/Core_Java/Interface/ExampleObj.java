package Interface;

public class ExampleObj {
	public static void main(String[] args) {
		Example1 data = (a, b) -> {
			return a + b;

		};
		int result = data.add(10, 20);
		System.out.println(result);
	}

}
