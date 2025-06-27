package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterFrequency {
	public static void main(String[] args) {
		String data = "nirmAan";
		data= data.toLowerCase();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : data.toCharArray()) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		for(Entry<Character, Integer> c:m.entrySet()) {
			System.out.println(c);
		}
	}
}
