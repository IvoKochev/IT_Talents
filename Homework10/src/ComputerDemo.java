
public class ComputerDemo {

	public static void main(String[] args) {
		Computer laptop = new Computer();
		Computer computer = new Computer();
		laptop.year = 2016;
		laptop.price = 1250.50;
		laptop.operationSystem = "Linux";
		laptop.isNotebook = true;
		laptop.hardDiskMemory = 1000;
		laptop.freeMemory = 250.5;
		computer.year = 2017;
		computer.price = 2000;
		computer.operationSystem = "Mac OS";
		computer.isNotebook = false;
		computer.hardDiskMemory = 750;
		computer.freeMemory = 125.7;
		laptop.useMemory(210.5);
		computer.changeOperationSystem("Windows");
		System.out.println("Laptop: year: " + laptop.year + " price: " + laptop.price
				+ " OS: " + laptop.operationSystem + " is Notebook: " + laptop.isNotebook
				+ " hard disk memory: " + laptop.hardDiskMemory + " free memory: " + laptop.freeMemory);
		System.out.println("Computer: year: " + computer.year + " price: " + computer.price
				+ " OS: " + computer.operationSystem + " is Notebook: " + computer.isNotebook
				+ " hard disk memory: " + computer.hardDiskMemory + " free memory: " + computer.freeMemory);
		
	}

}
