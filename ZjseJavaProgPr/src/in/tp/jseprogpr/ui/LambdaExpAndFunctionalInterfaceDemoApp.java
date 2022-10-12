package in.tp.jseprogpr.ui;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class LambdaExpAndFunctionalInterfaceDemoApp {

	public static void main(String[] args) {
		
		IntPredicate isEven = n -> n%2==0;
		System.out.println("123 is even: " + isEven.test(123));
		System.out.println("124 is even: " + isEven.test(124));
		
		IntPredicate isOdd = num -> num%2!=0;
		System.out.println("\nIf 3 is Odd: "+isOdd.test(3));
		
		IntBinaryOperator sum = (a, b) -> a+b;
		System.out.println("\nSum = "+ sum.applyAsInt(5, 3));

	}

}
