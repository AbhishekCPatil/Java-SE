package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C50IndividualDigitsWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		
		while (n>0) {
			int k=n%10;
			System.out.println(k);
			n=n/10;
		}
		scanner.close();

	}

}
