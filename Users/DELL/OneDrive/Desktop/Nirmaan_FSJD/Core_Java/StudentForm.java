
public class StudentForm {
	String name;
	int age;
	long number;

	public StudentForm() {

	}

	public StudentForm(String Name, int Age, long Number) {
		this.name = Name;
		age = Age;
		number = Number;
	}

	@Override
	public String toString() {
		return "StudentForm [name=" + name + ", age=" + age + ", number=" + number + "]";
	}
}
