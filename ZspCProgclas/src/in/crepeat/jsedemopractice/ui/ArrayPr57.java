package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class ArrayPr57 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] id = new int[10];
		
		for(int i=0;i<10;i++) {
			id[i] = scanner.nextInt();
			System.out.println(i);
		}
		
		scanner.close();

	}

}
