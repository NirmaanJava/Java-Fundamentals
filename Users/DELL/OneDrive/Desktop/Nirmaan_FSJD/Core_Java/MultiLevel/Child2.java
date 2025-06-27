package MultiLevel;

public class Child2 extends Child1{
	int c;

	public Child2(int c) {
		super();
		this.c = c;
	}

	public Child2() {
		super();
	}

	public Child2(int a, int b,int c) {
		super(a, b);
		System.out.println("C as Intialized");
		this.c=c;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "c=" + c + ", b=" + b + ", a=" + a + "]";
	}
	
	

}
