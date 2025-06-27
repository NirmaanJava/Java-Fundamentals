
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] MyArray = { 1, 2, 6, 9, 7, 8, 5 };

		for (int i = 0; i < 7; i++) {
			for (int j = i + 1; j < 7; j++) {
				if (MyArray[i] > MyArray[j]) {
					int temp = MyArray[i];
					MyArray[i] = MyArray[j];
					MyArray[j] = temp;
				}
			}
		}

		for (int num : MyArray) {
			System.out.print(num);
		}

	}

}
