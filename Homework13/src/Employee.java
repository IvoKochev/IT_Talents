
public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;
	private AllWork allwork;
	
	public AllWork getAllwork() {
		return allwork;
	}
	public void setAllwork(AllWork allwork) {
		if(allwork != null) {
			this.allwork = allwork;
		}
	}
	Employee() {
		this.hoursLeft = 8;
	}
	Employee(String name, AllWork allwork) {
		this();
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			this.name = "Noname";
		}
		if(allwork != null) {
			this.allwork = allwork;
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

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <=8) {
			this.hoursLeft = hoursLeft;
		}
	}

	
	void work() {
		if(this.currentTask != null) {
			if(this.hoursLeft < this.currentTask.getWorkingHours()) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			} else if(this.hoursLeft > this.currentTask.getWorkingHours()) {
				this.hoursLeft = this.hoursLeft - this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				System.out.println(this.name + " is done with: " + this.currentTask.getName());
				if(!allwork.isAllWorkDone()) {
					this.currentTask = this.allwork.getNextTask();
					System.out.println(this.name + " is now working on: " + this.currentTask.getName());
				} else {
					this.currentTask = null;
				}
			} else {
				this.hoursLeft = 0;
				this.currentTask.setWorkingHours(0);
				System.out.println(this.name + " is done with: " + this.currentTask.getName());
				if(!allwork.isAllWorkDone()) {
					this.currentTask = this.allwork.getNextTask();
					System.out.println(this.name + " is now working on: " + this.currentTask.getName());
				} else {
					this.currentTask = null;
				}
			}
		} else {
			if(!(this.allwork.isAllWorkDone())) {
				this.currentTask = this.allwork.getNextTask();
				System.out.println(this.name + " is now working on: " + this.currentTask.getName());
			}
		}
	}

	void showReport() {
		System.out.println("Employee name: " + this.name + "\n Employee task: " + this.currentTask.getName() +
				"\n Daily hours left: " + this.hoursLeft + "\n Hours left for the task to be done: " + this.currentTask.getWorkingHours());
	}

	void startWorkingDay() {
		this.hoursLeft = 8;
	}
}
