
public class Task {
	private String name;
	private double workingHours;

	Task(String name, double workingHours) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "Noname task";
		}
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			this.workingHours = 10;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

}
