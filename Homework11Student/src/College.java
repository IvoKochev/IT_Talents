
public class College {

	public static void main(String[] args) {
		Student ivo = new Student("Ivo Kochev", "Computer and software engineering", 20);
		ivo.setYearInCollege(2);
		ivo.setGrade(6);
		Student pesho = new Student("Pesho Pesho", "Telecomunications", 19);
		pesho.setYearInCollege(3);
		Student gosho = new Student("Georgi", "Telecomunications", 21);
		Student petq = new Student("Petq", "Computer and software engineering", 22);
		Student ivan = new Student("Ivan", "FTK", 19);
		Student petar = new Student("Petar", "Computer and software engineering", 20);
		StudentGroup ksi = new StudentGroup("Computer and software engineering");
		StudentGroup tlk = new StudentGroup("Telecomunications");
		StudentGroup ftk = new StudentGroup("FTK");
		ksi.addStudent(ivo);
		ksi.addStudent(petq);
		ksi.addStudent(petar);
		tlk.addStudent(pesho);
		tlk.addStudent(gosho);
		System.out.println(ksi.getFreePlaces() + 1);
		System.out.println(tlk.getFreePlaces()+1);
		System.out.println(ksi.theBestStudent());
		System.out.println(ivo.getName() + " has " + ivo.receiveSchoolarship(5, 100));
		System.out.println(petq.getName() + " has " + petq.receiveSchoolarship(5, 50));
		System.out.println("The best student in group: " + ksi.getGroupSubject() + " is " +ksi.theBestStudent());
		ftk.setFreePlaces(0);
		ftk.addStudent(ivan);
		ksi.emptyGroup();
		ksi.setStudents();
		//System.out.println(ksi.students[0].name);
		

	}

}
