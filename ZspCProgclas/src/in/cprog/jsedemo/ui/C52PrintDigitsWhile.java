package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C52PrintDigitsWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();		
		int count = 0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println(count);
		scanner.close();

	}

}
