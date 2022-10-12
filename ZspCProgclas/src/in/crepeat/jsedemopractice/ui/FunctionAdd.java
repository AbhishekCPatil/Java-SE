package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class FunctionAdd {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = add(a, b);
		System.out.println(String.format("Addition = %d", c));
		scan.close();

	}
	
	static int add(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}

}
