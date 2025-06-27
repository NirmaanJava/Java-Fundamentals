package SingleInhertiance;

public class Page2 extends Page1 {
	int RollNO;

	public Page2(int rollNO) {
		RollNO = rollNO;
	}

	public Page2() {
	}
	public Page2(String name,int age,int RollNo) {
		super(name,age);
		this.RollNO=RollNo;
	}
	
	

}
