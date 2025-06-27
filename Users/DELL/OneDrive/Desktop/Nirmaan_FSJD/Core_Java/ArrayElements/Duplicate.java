package ArrayElements;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 4, 6, 6, 7, 7 };
		List<Integer> result = new ArrayList<Integer>();
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {
			if (a[i] == a[i + 1]) {
//				System.out.println("Duplicated element");
				result.add(a[i]);
			}
		}
		System.out.println(result);

	}

}
