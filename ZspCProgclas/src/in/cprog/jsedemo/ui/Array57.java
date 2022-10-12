package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class Array57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] family = new String[5];
		
		System.out.println("Enter 5 family members: ");
		for(int i=0;i<5;i++) {
			family[i] = scanner.next();
			System.out.println(String.format("Hello %s", family[i]));
		}
		scanner.close();

	}

}
