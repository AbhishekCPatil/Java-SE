package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C45Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<=num;i++) {
			System.out.print("\t"+ a);
			c=a+b;
			a=b;
			b=c;
		}
		scanner.close();

	}

}
