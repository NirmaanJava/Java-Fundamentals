package Lambdas;

public class LambdasExample {

	public static void main(String[] args) {
		Example data = () -> {
			System.out.println("this is lambdasExample through functional Interefaces");

		};

		Example1 data1 = () -> {
			System.out.println("this is lambdasExample1 through functional Interefaces");

		};

		data.myMethod();
		data1.myMethod();

	}

}
