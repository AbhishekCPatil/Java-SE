package in.tp.jseprogpr.ui;

import java.util.function.IntPredicate;

public class LambdaPr {

	public static void main(String[] args) {
		
		IntPredicate isEven = num -> num%2==0;
		System.out.println("123 is even: "+isEven.test(123));
		
		int a = 5;
		int b=3;
		System.out.println(a=a+b);

	}

}
