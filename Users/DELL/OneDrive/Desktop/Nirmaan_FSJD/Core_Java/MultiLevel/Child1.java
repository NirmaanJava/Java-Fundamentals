package MultiLevel;

public class Child1 extends Parent {
	int b;

	public Child1() {

	}

	public Child1(int b) {
		this.b = b;

	}
	public Child1(int a,int b) {
		super(a);
		System.out.println("B as intilized");
		this.b=b;
		
	}

}
