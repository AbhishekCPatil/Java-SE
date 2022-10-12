package in.tp.jseprogpr.ui;

import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int addition = calculateSum(num1, num2);
		System.out.println("Sum = "+addition);
		
		scan.close();

	}
	
	public static int calculateSum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
