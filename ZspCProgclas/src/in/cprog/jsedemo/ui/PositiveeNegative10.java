package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class PositiveeNegative10 {
	
	public static void main(String []args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 2 numbers: ");
	
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	
	if (num1 > num2) {
		System.out.println(String.format("Bigger Number is: %d", num1));
	} else
		System.out.println(String.format("Bigger number is: %d", num2));
	
	scanner.close();
	}
	
}
