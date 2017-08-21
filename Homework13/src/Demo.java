
public class Demo {

	public static void main(String[] args) {
		AllWork allwork = new AllWork();
		Task createFB = new Task("Facebook", 128);
		Task createYoutube = new Task("Youtube", 220);
		Task createVB = new Task("Vbox7", 24);
		Task createZamunda = new Task("Zamunda", 122);
		Task createMoodle = new Task("Moodle", 100);
		Task createInstagram = new Task ("Instagram", 203);
		Task createSinoptik = new Task("Sinoptik", 32);
		Task createSportal = new Task("Sportal", 58);
		Task createLivescore = new Task("Livescore", 12);
		Task createTwitter = new Task("Twitter", 190);
		allwork.addTask(createFB);
		allwork.addTask(createYoutube);
		allwork.addTask(createVB);
		allwork.addTask(createZamunda);
		allwork.addTask(createMoodle);
		allwork.addTask(createInstagram);
		allwork.addTask(createSinoptik);
		allwork.addTask(createSportal);
		allwork.addTask(createLivescore);
		allwork.addTask(createTwitter);
		Employee ivo = new Employee("Ivo", allwork);
		Employee ivan = new Employee("Ivan", allwork);
		Employee pesho = new Employee("Pesho", allwork);
		int day = 1;
		while(true) {
			if(day > 1 && ivo.getCurrentTask() == null && ivan.getCurrentTask() == null && pesho.getCurrentTask() == null) {
				System.out.println("All the tasks are done!");
				break;
			}
			System.out.println("Day: " + day);
			day++;
			ivo.work();
			ivan.work();
			pesho.work();
			ivo.startWorkingDay();
			ivan.startWorkingDay();
			pesho.startWorkingDay();
		}
		

	}

}
