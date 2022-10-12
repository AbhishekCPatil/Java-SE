package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C59ArraySumAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an array");
		int[] arr = new int[4];
		int sum = 1;
		
		for(int a:arr) {
			arr[a] = scanner.nextInt();
		}
		for(int i=0; i<4; i++) {
			sum += arr[i];
			int avg = sum%4;
			System.out.println(avg);  // wrong ans. redo
		}
		System.out.println(sum);
		System.out.println();
		scanner.close();

	}

}
