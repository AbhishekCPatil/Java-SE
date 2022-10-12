package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			int product = number*i;
			System.out.println(number+" * "+i+" = "+product);
		}
		System.out.print("\n");
		System.out.println("--- for loop ends ---\n");
		
		int i=1;
		while(i<=10) {
			System.out.println(number+" * "+i+" = "+number*i);
			i++;
		}
		System.out.print("\n");
		System.out.println("---while loop ends---");
		scanner.close();
	}

}
