package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C51SumDigitsWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		int sum=0;
		
		while (n>0) {
			int k=n%10;
			sum=sum+k;	
			n=n/10;
		}
		System.out.println(sum);
		scanner.close();
	}

}
