
public class AllWork {
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnsignedTask;

	AllWork() {
		tasks = new Task[10];
		freePlacesForTasks = 10;
		currentUnsignedTask = 0;
	}
	
	void addTask(Task task) {
		int index = -1;
		for(int i = 0; i < this.tasks.length; i++) {
			if(tasks[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			this.tasks[index] = task;
			this.freePlacesForTasks++;
		} else {
			System.out.println("There is no place for this task!");
		}
	}

	boolean isAllWorkDone() {
		if(this.currentUnsignedTask == this.tasks.length) {
			return true;
		} else {
			return false;
		}
	}

	Task getNextTask() {
		this.freePlacesForTasks--;
		this.currentUnsignedTask++;
		return tasks[currentUnsignedTask-1];
		
	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public void setFreePlacesForTasks(int freePlacesForTasks) {
		if(freePlacesForTasks >= 0 && freePlacesForTasks <= 10) {
			this.freePlacesForTasks = freePlacesForTasks;
		}
	}

	public int getCurrentUnsignedTask() {
		return currentUnsignedTask;
	}

	public void setCurrentUnsignedTask(int currentUnsignedTask) {
		if(currentUnsignedTask >= 0 && currentUnsignedTask <= 10) {
			this.currentUnsignedTask = currentUnsignedTask;
		}
	}

	
}
