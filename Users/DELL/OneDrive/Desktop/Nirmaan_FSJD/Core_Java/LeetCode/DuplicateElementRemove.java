package LeetCode;

public class DuplicateElementRemove {

	public static char[] methodName(char[] MyArray) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < MyArray.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (MyArray[i] == MyArray[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				sb.append(MyArray[i]);
			}
		}
		return sb.toString().toCharArray();
	}

	public static void main(String[] args) {
		char[] name = { 'a', 'b', 'c', 'a' };
		char[] result = DuplicateElementRemove.methodName(name);
		System.out.println(result); // Output: abc
	}
}
