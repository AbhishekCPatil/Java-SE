package in.tp.jsedemopractice.model;

public class StudentPr {
	private int rollNo;
	private String name;
	private int sub1, sub2, sub3;
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
/*	public void setSub1(int sub1, int sub2, int sub3) {  //doubt to declare sub in 1 fn
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3; 
	} */
	
	public void setSub1(int sub1) {
		this.sub1=sub1;
	}	
	public int getSub1() {
		return sub1;
	}
	
	public void setSub2(int sub2) {
		this.sub2=sub2;
	}
	public int getSub2() {
		return sub2;
	}
	
	public void setSub3(int sub3) {
		this.sub3=sub3;
	}
	public int getSub3() {
		return sub3;
	}
	
	public int getTotal() {
		return sub1+sub2+sub3;
	}
	public int getAverage() {
		return ((sub1+sub2+sub3)/3);
	}

}
