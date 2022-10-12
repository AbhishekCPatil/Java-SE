package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C39Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int factorial = 1;
		
		for (int i=num; i>=1; i--) { //(or) for(i=1; i<=n; i++)
			
			factorial*=i;			
		}
		System.out.println(String.format("Factorial is: %d", factorial));
		scanner.close();
	}

}
