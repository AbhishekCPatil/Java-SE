package in.tp.jseprogpr.ui;

public class StringPr1 {

	public static void main(String[] args) {
		String str = "0AbcdefGHIjA";
		System.out.println(str); //magnitude
		
		StringPr1 test = new StringPr1();
		System.out.println(test.toString()+" this is fully qualified hashcode"); //hashcode
		
		System.out.println(str.length());
		
		System.out.println(str.toCharArray());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("H"));
		System.out.println(str.lastIndexOf("A"));
		
		System.out.println(str.substring(5));
		System.out.println("Line 20: "+str.substring(1, 11));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.contains("Abc")); 
		System.out.println(str.endsWith("t"));
		
		String[] names = {"Abhi","Vijay"};
		
		for(String name: names) {
			System.out.println(name);
		}

	}

}