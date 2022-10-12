package in.crepeat.jsedemopractice.ui;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");
		int radius = scanner.nextInt();
		
		double PI = 3.14;
		double area = PI*radius*radius;
		
		System.out.println(String.format("Area of the circle is: %f", area));
		
		scanner.close();

	}

}
