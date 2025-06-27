package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringCharacter {
	public static void main(String[] args) {
		String sample = "abcabcd";
		Map<Character, Integer> data = new HashMap<Character, Integer>();

		int length = sample.length();

		for (int i = 0; i < length; i++) {
			while (data.containsKey(sample.charAt(i))) {
				// remove
				data.remove(sample.charAt(i));
			}
			{
				// add
				data.put(sample.charAt(i), 1);
			}

		}
		System.out.println(data);
	}

}
