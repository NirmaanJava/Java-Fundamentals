package AbstractionExample;

public class Child implements Parent2 {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.name();
		c1.name1();

	}

	@Override
	public void name1() {
		System.out.println("this is parent2");

	}

	public void name() {
		// TODO Auto-generated method stub
		System.out.println("this is parent1");
	}

}
