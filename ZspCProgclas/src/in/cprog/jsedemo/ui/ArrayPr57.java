package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class ArrayPr57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] rollNo = new int[5];
		
		System.out.println("Enter Roll Numbers: ");
		
		for(int i=0; i<5; i++) {
			rollNo[i] = scanner.nextInt();
		}
		
		/* for (int i=0; i<5; i++)
		System.out.println(String.format("Roll Numbers are: %d ", rollNo[i]));

	} */
		for (int i=0; i<5; i++) {
			System.out.println(String.format("%d", rollNo[i]));
		}
		scanner.close();
		}

}
