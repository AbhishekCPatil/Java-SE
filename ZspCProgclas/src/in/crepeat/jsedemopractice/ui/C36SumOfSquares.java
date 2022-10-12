package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class C36SumOfSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scanner.nextInt();
		int sum = 0;
		
		for (int i=1;i<=num;i++) {
			int j = i*i;
			sum+=j;
		}
		System.out.println(String.format("Sum of squares of numbers: %d", sum));
		
		scanner.close();

	}

}
