package Day4;

public class StudentForm {
	String name;
	int rollNo;
	byte age;
	String depart;

//	access return type methodname arguments
////	No arguments constructors
//	public StudentForm() {
//		
//	}
////	 Parameter List Constructor
//	public StudentForm(String Name,int RollNo, byte Age, String Depart) {
//		this.name = Name;
//		this.rollNo=RollNo;
//		this.age=Age;
//		this.depart=Depart;
//		
//	}
//	
//	
	public StudentForm(String name, int rollNo, byte age, String depart) {
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.depart = depart;
	}

	public StudentForm() {
		super();
	}

}
