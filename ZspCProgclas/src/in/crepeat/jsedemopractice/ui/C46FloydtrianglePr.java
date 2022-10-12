package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class C46FloydtrianglePr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();

	}

}
