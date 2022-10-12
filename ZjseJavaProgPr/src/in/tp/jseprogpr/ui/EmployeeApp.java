package in.tp.jseprogpr.ui;

import in.tp.jseprogpr.model.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(); //Constructor
		System.out.println("Details: \n"+emp2.getEmpId()+"\n"+emp2.getName()+"\n"+emp2.getSalary()+"\n");
		emp1.setEmpId(11);
		emp1.setName("Abhi");
		emp1.setSalary(50123);
		
		System.out.println("Details: \n"+ emp1.getEmpId() + "\n" + emp1.getName() + "\n" + emp1.getSalary());
		System.out.println();

	}

}
