package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class PositiveNegativeOpr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		if(number!=0) {
			if(number>0) {
				System.out.println("Number is Positive");
			} else
				System.out.println("Number is Negative");
		} else
			System.out.println("Please enter a Non-zero number.");
		
		scanner.close();

	}

}
