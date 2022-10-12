package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C41FactorsOfNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		scanner.close();

	}

}
