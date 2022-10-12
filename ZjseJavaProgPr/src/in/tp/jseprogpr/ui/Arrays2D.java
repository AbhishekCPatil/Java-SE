package in.tp.jseprogpr.ui;

import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = scan.nextInt();
		System.out.println("Enter column");
		int cols = scan.nextInt();
		
		System.out.println("Enter elements");
		int[][] numbers = new int[rows][cols];
		
		//input
		
		//rows
		for(int i=0; i<rows; i++) {
			//cols
			for(int j=0; j<cols; j++) {
				numbers[i][j] = scan.nextInt();
			}
			
		}
		//output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}
