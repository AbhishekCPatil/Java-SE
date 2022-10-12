package in.tp.jseprogpr.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("Ax2xB");
		System.out.println("String matches = "+ matcher.matches());

	}

}
