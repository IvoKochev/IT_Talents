
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] people = new Person[10];
		Person pesho = new Person("Pesho", 19, true);
		Person gosho = new Person("Gosho", 13, true);
		Person ivo = new Student("Ivo", 20, true, 6);
		Person petq = new Student("Petq", 21, false, 5);
		Person ivan = new Employee("Ivan", 25, true, 34);
		Person plamen = new Employee("Plamen", 31, true, 42);
		addPeople(pesho, people);
		addPeople(gosho, people);
		addPeople(ivo, people);
		addPeople(petq, people);
		addPeople(ivan, people);
		addPeople(plamen, people);
		
		for(int i = 0; i < people.length; i++) {
			if(people[i] == null) {
				continue;
			} else {
				if(people[i] instanceof Student) {
					((Student)people[i]).showStudentInfo();
				} else if(people[i] instanceof Employee) {
					((Employee)people[i]).showEmployeeInfo();
				} else {
					people[i].showPersonInfo();
				}
			}
		}
		
		for(int i = 0; i < people.length; i++) {
			if(people[i] != null && people[i] instanceof Employee) {
				System.out.println(people[i].getName() + ": " +((Employee)people[i]).calculateOvertime(2));
			}
		}

	}
	
	

	static void addPeople(Person person, Person[] people) {
		int index = -1;
		for(int i = 0; i < people.length; i++) {
			if(people[i] == null) {
				index = i;
				break;
			}
		}
		people[index] = person;
	}

}
