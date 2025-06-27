package LeetCode;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {

		// declare input & boolean Value
		String Input = "hello world,44 java";
		boolean data = true;

		// Convert String into char []
		char[] InputChar = Input.toCharArray();

		// Iterate each character using for loop
		for (int i = 0; i < InputChar.length; i++) {
			if (InputChar[i] == ' ') {
				data = true;
			} else if (data) {
				InputChar[i] = (char) (InputChar[i] - 32);
				data = false;

			} else {
				data = false;
			}
		}

		System.out.println(new String(InputChar));

	}

}
