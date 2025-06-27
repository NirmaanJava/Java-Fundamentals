package Day3;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="saranya";
		int Count=0;
		
		String s2= s1.toLowerCase();
//		System.out.println(s2);
		for(int i=0;i<s2.length();i++) {
			if((s2.charAt(i)=='a')|| (s2.charAt(i)=='e')|| (s2.charAt(i)=='i')||(s2.charAt(i)=='o')||(s2.charAt(i)=='u')) {
				Count++;
			}
		}
		System.out.println(Count);

	}

}
