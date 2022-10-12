package in.tp.jseprogpr.model;

public class Employee {
	private static double deductions = .12; //deductions 12%
	
	private int empId;
	private String name;
	private int salary;
	
	public Employee() {
		this.empId=1;
		this.name="Vijay";
		this.salary=30123;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double credit() {
		double amount = salary-(deductions*salary);
		return amount;
	}
	
	public static Employee total(Employee a, Employee b) {
	Employee emp1 = new Employee();
	emp1.salary = a.salary+b.salary;
	return emp1;
	}

}
