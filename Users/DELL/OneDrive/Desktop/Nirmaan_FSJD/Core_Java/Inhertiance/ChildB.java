package Inhertiance;

public class ChildB extends ParentA {
	long number;

	public ChildB() {

	}

	public ChildB(long number) {
		this.number = number;

	}

	public ChildB(String name, String email, long number) {
		super(name, email);
		this.number = number;
	}

}
