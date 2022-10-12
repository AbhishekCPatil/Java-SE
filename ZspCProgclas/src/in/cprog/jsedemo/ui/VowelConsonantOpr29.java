package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class VowelConsonantOpr29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		
		char ch = scanner.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
			System.out.println("The character is Vowel: "+ ch);
		} else
			System.out.println("The character is a Consonant: " + ch);
		
		scanner.close();

	}

}
