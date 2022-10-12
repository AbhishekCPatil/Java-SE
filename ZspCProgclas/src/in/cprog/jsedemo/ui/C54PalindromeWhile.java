package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C54PalindromeWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int rev = 0;
		int i = num;
		
		while(num>0) {
			int k = num%10;
			rev = rev*10+k;
			num /= 10;
		}
		if(i==rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		scanner.close();

	}

}
