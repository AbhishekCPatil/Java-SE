package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class NaturalNosReverse32 {
	
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		for (int i=num;i>=1;i--) {
			System.out.println(i);
		}
		scanner.close();
		
	}

}
