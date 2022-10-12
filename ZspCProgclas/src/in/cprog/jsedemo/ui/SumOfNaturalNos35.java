package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class SumOfNaturalNos35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int sum=0;
		int num = scanner.nextInt();
		
		for(int i=0;i<=num;i++) {
			
			sum=sum+i;
		}
		System.out.println(sum);
		
		scanner.close();

	}

}
