package Array_String;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Student1";
		int leng=s1.length();
		String Rev = "";
		for(int i=leng-1; i>=0;i--) {
			Rev+=s1.charAt(i);
		}
		System.out.println(Rev);

	}

}
