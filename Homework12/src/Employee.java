
public class Employee extends Person {
	private double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if(daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			this.daySalary = 40;
		}
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if(daySalary > 0) {
			this.daySalary = daySalary;
		}
	}
  
	
	double calculateOvertime(double hours) {
		if(this.getAge() < 18) {
			return 0;
		} else {
			return hours*(this.getDaySalary() / 8 )*1.5;
		}
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Daily salary: " + this.daySalary);
	}
}
