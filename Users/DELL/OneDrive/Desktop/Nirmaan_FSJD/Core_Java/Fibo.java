
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		System.out.println(first);
		System.out.println(second);
		int temp;
		for (int i = 0; i < 6; i++) {
			temp = first + second;
			System.out.println(temp);
			first = second;
			second = temp;
		}

	}

}
