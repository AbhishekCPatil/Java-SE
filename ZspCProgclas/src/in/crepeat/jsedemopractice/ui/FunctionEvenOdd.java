package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class FunctionEvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		findEvenOdd(num);
		scan.close();

	}
	
	public static int findEvenOdd(int num) {
		if(num%2==0)
			System.out.println(num+" is odd");
		else
			System.out.println(num+" is even");
		
		return num;
	}

}
