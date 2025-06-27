
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello world, java";
		char[] inputCharacter = input.toCharArray();
		for (int i = 0; i < inputCharacter.length; i++) {
			if (inputCharacter[i] == ' ') {
				inputCharacter[i + 1] = (char) (inputCharacter[i + 1] - 32);
			}
		}
		System.out.println(new String(inputCharacter));
	}

}
