import java.util.Stack;

public class StacksExample {

	public static boolean MyMethods(String s) {
		Stack<Character> myStack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				myStack.push(')');
			} else if (c == '[') {
				myStack.push(']');
			} else if (c == '{') {
				myStack.push('}');
			} else if (myStack.isEmpty() || c != myStack.pop()) {
				return false;
			}
		}
		return myStack.isEmpty();

	}

	public static void main(String[] args) {
		String input = "(({{}}))[";
		boolean result = MyMethods(input);
		System.out.println(result);
	}

}
