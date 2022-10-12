package in.tp.jseprogpr.ui;

import in.tp.jseprogpr.model.EmployeeNew;
import in.tp.jseprogpr.model.Gender;
import in.tp.jseprogpr.model.Manager;

public class OOPEmployeeNewApp {

	public static void main(String[] args) {
		EmployeeNew emp = new EmployeeNew(101, "Abhi", Gender.MALE, 55000);
		System.out.println(emp);
		
		Manager mgr = new Manager(102, "Avi", Gender.MALE, 65000, 4000);
		System.out.println(mgr);

	}

}
