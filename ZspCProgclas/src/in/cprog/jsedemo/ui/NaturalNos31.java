package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class NaturalNos31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		
		for (int i=1;i<=num;i++) {
			System.out.println(i);
		}
		scanner.close();

	}

}
