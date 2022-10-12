package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class EvenNosBet1andN33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt()
				;
		for (int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		scanner.close();

	}

}
