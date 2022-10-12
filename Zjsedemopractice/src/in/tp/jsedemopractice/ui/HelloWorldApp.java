package in.tp.jsedemopractice.ui;

import java.util.Scanner;

public class HelloWorldApp {

	public static void main(String[] args) {
		System.out.println("Hello World! Welcome to Java");
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Whats your name? ");
		String name = scanner.next();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		
		System.out.println(String.format("Hello! %s! So you re just %d years old", name, age));
		
		scanner.close();
	}
}
