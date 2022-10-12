package in.tp.jsedemopractice.ui;

import in.tp.jsedemopractice.model.StudentPr;

public class ClassObjectStudentAppPr {

	public static void main(String[] args) {
		StudentPr s1 = new StudentPr();
		StudentPr s2 = new StudentPr();
		
		s1.setRollNo(5);
		s1.setName("Vijay");
		s1.setSub1(25);
		s1.setSub2(23);
		s1.setSub3(18);
		System.out.println("Student Name: " + s1.getName() + "Student ROll No.: " + s1.getRollNo());
		System.out.println("Subjects marks are: ");
		System.out.println(s1.getSub1() + ", " + s1.getSub2() + ", " + s1.getSub3());
		System.out.print("Total Marks: "); //tried to print "Total marks of name is: Total Marks
		System.out.println(s1.getTotal()); // tried to print name and marks with String.factor() but used +
		
		System.out.print("Average marks: ");
		System.out.println(s1.getAverage());
		
		System.out.println("Total Marks & Average of " + s1.getName() + " are "
							+ s1.getTotal() + " & " + s1.getAverage());
		
		s2.setName("Akash");
		s2.setRollNo(2);
		s2.setSub1(20);
		s2.setSub2(18);
		s2.setSub3(15);
		
		System.out.println("Total marks & Average of " + s2.getName() + " are " + s2.getTotal()
							+ " & " + s2.getAverage() );

	}

}
