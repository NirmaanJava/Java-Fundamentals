import java.util.Stack;

public class Stacks {
	public static boolean isValid(String s) {
		Stack<Character> stackData = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stackData.push(')');
			} else if (c == '{') {
				stackData.push('}');
			} else if (c == '[') {
				stackData.push(']');
			} else if (stackData.isEmpty() || c != stackData.pop()) {
				return false;
			}
		}
		return stackData.isEmpty();
	}

	public static void main(String[] args) {
		String data = "()[]{}";
		boolean result = isValid(data);
		System.out.println(result);

	}

}
