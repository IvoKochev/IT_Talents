
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee ivo = new Employee("Ivo");
		ivo.setHoursLeft(7);
		Employee pesho = new Employee("Pesho");
		pesho.setHoursLeft(8);
		Employee petq = new Employee("Petq");
		petq.setHoursLeft(5);
		Task dig = new Task("Dig", 12);
		Task sing = new Task("Sing", 8);
		Task write = new Task("Write", 5);
		ivo.setCurrentTask(dig);
		pesho.setCurrentTask(sing);
		petq.setCurrentTask(write);
		ivo.showReport();
		ivo.work();
		ivo.showReport();
		pesho.work();
		petq.work();

	}

}
