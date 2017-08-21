
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	String operationSystem;
	public void changeOperationSystem(String newOperationSystem) {
		if(newOperationSystem.equals(operationSystem)) {
			System.out.println("This computer is with the same operation system!");
		} else {
			if(newOperationSystem.equals("Windows") || newOperationSystem.equals("Linux") || newOperationSystem.equals("Mac OS")) {
				operationSystem = newOperationSystem;
			} else {
				System.out.println("There is no such operation system!");
			}
		}
	}
	
	public void useMemory(double memory) {
		if(memory > freeMemory) {
			System.out.println("Not enough memory!");
		} else {
			freeMemory -= memory;
		}
		
	}

}
