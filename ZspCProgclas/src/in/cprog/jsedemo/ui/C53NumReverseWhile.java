package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C53NumReverseWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = scanner.nextInt();
		
		int reverse = 0;
		
		while(num>0) {
			int k = num%10;
			reverse = reverse*10+k;
			num /= 10;		
		}
		System.out.println(String.format("Reversed Number = %d", reverse));
		scanner.close();

	}

}
