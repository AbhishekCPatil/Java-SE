package in.tp.jseprogpr.model;

public class Student {
	private int rollNo;
	private String name;
	private int sub1, sub2, sub3;
	public int getRollNo() {
		return rollNo;
	}
		
	public Student() {
		this.rollNo = 11;
		this.name = "Abhi";
		this.sub1 = 98;
		this.sub2 = 94;
		this.sub3 = 89;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public int getTotalMarks() {
		int totalMarks = sub1+sub2+sub3;
		
		return totalMarks;
	}
	
	public double getAverage() {
		double average = (sub1+sub2+sub3)/3;
		
		return average;
	}	
	
}


