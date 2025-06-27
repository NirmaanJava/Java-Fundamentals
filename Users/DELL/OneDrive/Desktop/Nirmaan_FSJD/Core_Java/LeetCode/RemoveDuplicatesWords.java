package LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String input = "hello world Hello World";
		// TODO Auto-generated method stub
		input = input.toLowerCase();
		System.out.println(input);
//
		String[] SplitedString = input.split(" ");

		Set<String> Myset = new LinkedHashSet<String>();

		for (String s : SplitedString) {
			if (!(Myset.contains(s))) {
				// true block
				System.out.println("addedd");
				Myset.add(s);

			}
		}
		System.out.println(Myset);

	}

}
