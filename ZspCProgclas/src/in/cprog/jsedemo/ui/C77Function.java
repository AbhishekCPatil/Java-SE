package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C77Function {

	public static void main(String[] args) {
		System.out.println("Enter principle: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter time: ");
		int b = scan.nextInt();
		System.out.println("Enter rate of interest(%): ");
		int c = scan.nextInt();
		
		double d = simple_interest(a, b, c);
		System.out.println(String.format("Simple Interest = %f", d));
		
		scan.close();

	}
	
	static double simple_interest(int p,int t,int r) {		
		double si = p*t*r/100.0;
		return si;
	}

}
