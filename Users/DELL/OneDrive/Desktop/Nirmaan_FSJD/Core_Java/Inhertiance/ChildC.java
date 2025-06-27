package Inhertiance;

public class ChildC extends ChildB {
	String Addrees;

	public ChildC(String addrees) {
		Addrees = addrees;
	}

	public ChildC(String name, String email, long number, String Address) {
		super(name, email, number);
		this.Addrees = Address;
	}

	@Override
	public String toString() {
		return "ChildC [Addrees=" + Addrees + ", number=" + number + ", name=" + name + ", email=" + email + "]";
	}
	

}
