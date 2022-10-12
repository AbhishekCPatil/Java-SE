package in.cprog.jsedemo.ui;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcius: ");
		float celcius = scanner.nextFloat();
		
		float farenheit = (celcius*9/5)+32;
		System.out.println(String.format("Temperature in Farenheit = %f", farenheit));
		
		scanner.close();

	}

}
