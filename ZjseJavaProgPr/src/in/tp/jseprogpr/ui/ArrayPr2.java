package in.tp.jseprogpr.ui;

import java.util.Scanner;

public class ArrayPr2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println(numbers[i]);
		}
		scanner.close();
	}

}
