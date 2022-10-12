package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class C42SumOfFactorsPr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
