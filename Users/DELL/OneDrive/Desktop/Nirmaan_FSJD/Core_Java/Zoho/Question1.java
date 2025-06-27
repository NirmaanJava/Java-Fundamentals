package Zoho;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 = "aA";
		String st2 = "aAAbbbb";
		int num = 0;
							//7
		for (int i = 0; i < st2.length(); i++) {
			System.out.println(st2.charAt(i)!=-1);
			if (st1.indexOf(st2.charAt(i)) == -1) {
				num++;
			}
		}
		System.out.println(num);

	}
	

}
