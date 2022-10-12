package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C43NoOfFactors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int count = 0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();

	}

}
