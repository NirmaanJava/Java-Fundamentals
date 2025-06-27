package LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// Input String
		String input = "Hello World hello";

		// Convert to lowercase
		input = input.toLowerCase();

		// Split into words
		String[] individual = input.split(" ");

		// Use LinkedHashSet to maintain order and uniqueness
		Set<String> set = new LinkedHashSet<>();

		// Add only unique words
		for (String word : individual) {
			if (!set.contains(word)) {
				set.add(word);
				System.out.println(word + " added");
			} else {
				System.out.println(word + " skipped (duplicate)");
			}
		}

		// finally print it
		System.out.println(set);
	}
}
