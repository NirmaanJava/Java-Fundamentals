package Day6;

import java.util.Scanner;

public class Oxygen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Length of floor");
		double length = s.nextDouble();
		if (length <= 0) {
			System.out.println("Length should be positive");
		}
		System.out.println("Enter the breadth of floor");
		double breadth = s.nextDouble();
		if (breadth <= 0) {
			System.out.println("Breadth should be positive");
			
			
		}
		System.out.println("Enter the plant area of a single plant(in cm2)");
		double singlePlantArea = s.nextDouble();
		if (singlePlantArea <= 0) {
			System.out.println("Area should be positive");
		}
//		
		double floorArea = length * breadth;
		double totalPlantAreaInFloorArea = (floorArea / singlePlantArea)*100*100 ;
		int digit = (int) (totalPlantAreaInFloorArea % 10);
		if(digit>5){
			totalPlantAreaInFloorArea+=1;
		}else {
			totalPlantAreaInFloorArea= totalPlantAreaInFloorArea ;
		}
		int oxygenProduction = (int) ((int)totalPlantAreaInFloorArea * 0.9);
		System.out.println("floorArea ="+ floorArea);
		System.out.println("totalPlantAreaInFloorArea ="+ totalPlantAreaInFloorArea);
		System.out.println("oxygenProduction="+ oxygenProduction);
		s.close();
	}
}
