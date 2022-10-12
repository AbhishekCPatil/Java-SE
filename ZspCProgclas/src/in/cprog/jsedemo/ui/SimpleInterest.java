package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		int principal = scanner.nextInt();
		
		System.out.print("Enter Time(Year): ");
		int time = scanner.nextInt();
		
		System.out.print("Enter RateOfInterest: ");
		int roi = scanner.nextInt();
		
		float simpleInterest = (float)(principal*time*roi)/100;
		
		System.out.println(String.format("Simple Interest = %f", simpleInterest));
				
		scanner.close();
	}
}
