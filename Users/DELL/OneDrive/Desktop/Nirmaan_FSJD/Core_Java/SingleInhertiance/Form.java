package SingleInhertiance;

public class Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Page2 Student1= new Page2("Student1", 22, 180);
		Page2 Student2 =new Page2();
		System.out.println(Student1);
		System.out.println(Student2);
		System.out.println(Student1 == Student2);
		System.out.println(Student1.equals(Student2));
	}

}
