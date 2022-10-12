package in.tp.jseprogpr.ui;

import in.tp.jseprogpr.model.Student;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student a3 = new Student(); //Constructor object
		
		s1.setRollNo(1);
		s1.setName("Akash");
		s1.setSub1(85);
		s1.setSub1(75);
		s1.setSub1(84);
		System.out.println("Details of: '" +s1.getName()+"'");
		System.out.println("Total Marks = "+s1.getTotalMarks());
		System.out.println("Average Marks = "+s1.getAverage()+"\n");
		
		System.out.println("Details of: "+"'"+a3.getName()+"'");
		System.out.println("Total Marks = "+a3.getTotalMarks());
		System.out.println("Average marks = "+a3.getTotalMarks()+"\n");
		
		s2.setRollNo(2);
		s2.setName("Vijay");
		s2.setSub1(89);
		s2.setSub1(76);
		s2.setSub1(87);
		System.out.println("Details of: '" +s2.getName()+"'");
		System.out.println("Total Marks = "+s2.getTotalMarks());
		System.out.println("Average Marks = "+s2.getAverage());

	}

}
