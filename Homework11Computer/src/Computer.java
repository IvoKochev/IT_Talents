
public class Computer {
	private int year;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year > 1970 && year < 2018) {
			this.year = year;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 100) {
			this.price = price;
		}
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		if(hardDiskMemory > 80) {
			this.hardDiskMemory = hardDiskMemory;
		}
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		if(freeMemory > 0) {
			this.freeMemory = freeMemory;
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if(validateOS(operationSystem)) {
			this.operationSystem = operationSystem;
		}
	}

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		if (year > 1970 && year < 2018) {
			this.year = year;
		} else {
			this.year = 2015;
		}
		if (price > 100) {
			this.price = price;
		} else {
			this.price = 400;
		}
		if (hardDiskMemory > 80) {
			this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = 250;
		}
		if (freeMemory > 0) {
			this.freeMemory = freeMemory;
		} else {
			this.freeMemory = 0;
		}
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		if(year > 1970 && year<2018) {
		this.year = year;
		} else {
			this.year = 2015;
		}
		if(price > 100) {
		this.price = price;
		} else {
			this.price = 400;
		}
		this.isNotebook = isNotebook;
		if(hardDiskMemory > 80) {
		this.hardDiskMemory = hardDiskMemory;
		} else {
			this.hardDiskMemory = 250;
		}
		if(freeMemory > 0) {
		this.freeMemory = freeMemory;
		} else {
			this.freeMemory = 0;
		}
		if(validateOS(operationSystem)) {
		this.operationSystem = operationSystem;
		} else {
			this.operationSystem = "Win XP";
		}
	}

	int comparePrice(Computer pc) {
		if (this.price > pc.getPrice()) {
			return -1;
		} else if (this.price < pc.getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}

	boolean validateOS(String os) {
		if(os.equals("Win 7") || os.equals("Win XP") || os.equals("Win 10") || os.equals("Win VISTA")
		|| os.equals("Linux") || os.equals("Mac OS")) {
			return true;
		} else {
			return false;
		}
	}
}
