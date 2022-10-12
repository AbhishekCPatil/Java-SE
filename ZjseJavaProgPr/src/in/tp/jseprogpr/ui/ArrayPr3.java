package in.tp.jseprogpr.ui;

import java.util.Scanner;

public class ArrayPr3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] contact = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println(contact[i]);
		}
		scanner.close();

	}

}
