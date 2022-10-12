package in.tp.jseprogpr.ui;

import java.util.Scanner;

public class FindXArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scan.nextInt();
		System.out.println("Enter column");
		int cols = scan.nextInt();
		
		System.out.println("Enter elements");
		int[][] numbers = new int[rows][cols];

		//rows
		for(int i=0; i<rows; i++) {
			//cols
			for(int j=0; j<cols; j++) {
				numbers[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter the value of x");
		int x = scan.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				//compare with x
				if(numbers[i][j] == x) {
					System.out.println("location of x= "+ i +","+ j);
					System.out.println("x found at the location ("+ i + "," + j + ")");
				}
			}
		}
		scan.close();

	}

}
