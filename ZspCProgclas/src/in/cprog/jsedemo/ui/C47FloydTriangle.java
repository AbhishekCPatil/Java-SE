package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class C47FloydTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		scanner.close();
	}

}