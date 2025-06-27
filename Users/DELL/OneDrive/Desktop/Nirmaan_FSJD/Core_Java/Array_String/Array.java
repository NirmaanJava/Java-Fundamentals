package Array_String;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 
		String [] StudentArray= {"Student1","Student1","Student3"};
		String Array[]=new String[10];
		
		for(String num:StudentArray ) {
		System.out.print(num +" ");
		}
		System.out.println(StudentArray[0]==StudentArray[1]);
		System.out.println(StudentArray.equals(Array));
	}

}
