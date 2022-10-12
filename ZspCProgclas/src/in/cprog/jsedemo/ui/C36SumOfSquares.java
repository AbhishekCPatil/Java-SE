package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C36SumOfSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int sum = 0;
		int num = scanner.nextInt();	
		for(int i=1; i<=num; i++) {
			int j = i*i;
			sum+=j;
		}
		System.out.println(sum);
		scanner.close();
				

	}

}
