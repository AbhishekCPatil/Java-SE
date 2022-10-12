package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class EvenOdd12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		if(number!=0) {
			if(number%2==0) {
				System.out.println("Number is even.");
			} else
				System.out.println("Number is odd.");
		} else
			System.out.println("Please enter a Non-Zero number.");
		
		scanner.close();

	}

}
