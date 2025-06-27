package Array_String;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [][] Array= new int [3][3];
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(array[2][2]);
		for(int i=0;i<3;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
