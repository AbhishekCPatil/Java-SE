package in.tp.jseprogpr.model;

public class Manager extends EmployeeNew {
	private double allowance;
	
	public Manager() {
		super();
	}

	public Manager(int empId, String fullName, Gender gender, double basic, double allowance) {
		super(empId, fullName, gender, basic);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public String toString() {
		return super.toString() + ", allowance = "+allowance;
	}
	

}
