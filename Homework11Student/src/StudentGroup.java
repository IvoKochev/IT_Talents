
public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	StudentGroup() {
		this.students = new Student[5];
		freePlaces = 5;	
	}
	
	public String getGroupSubject() {
		return groupSubject;
	}

	public void setGroupSubject(String groupSubject) {
		if(groupSubject != null && !groupSubject.isEmpty()) {
			this.groupSubject = groupSubject;
		}
	}

	public Student[] getStudents() {
		return students;
	}


	

	public int getFreePlaces() {
		return freePlaces;
	}

	public void setFreePlaces(int freePlaces) {
		if(freePlaces >= 0) {
			this.freePlaces = freePlaces;
		}
	}

	StudentGroup(String subject) {
		this();
		if(subject != null && !subject.equals("")) {
			this.groupSubject = subject;
		} else {
			this.groupSubject = "Computer and software engineering";
		}
	}

	int getIndex(Student[] st) {
		int index = -1;
		for(int i = 0; i < st.length; i++) {
			if(st[i] == null) {
				index = i;
				break;
			}
		}
		return index;
		
	}
	void addStudent(Student st) {
		if(this.freePlaces > 0) {
		boolean isEmpty = false;
		int index = -1;
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i] == null) {
				index = i;
				isEmpty = true;
				break;
			}
		}
		if(st.getSubject().equals(this.groupSubject) && isEmpty) {
			this.students[index] = st;
			this.freePlaces--;
		} else {
			System.out.println(st.getName() + " is in different subject!");
		}
		} else {
			System.out.println(st.getName() + " can't be added in this group because there are no free places!");
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		freePlaces = 5;
		System.out.println(this.groupSubject + " has been cleaned and there are 5 free places now!");
	}

	String theBestStudent() {
		String best = "";
		double maxGrade = 2;
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i] != null && this.students[i].getGrade() > maxGrade) {
				maxGrade = this.students[i].getGrade();
				best = this.students[i].getName();
			}
		}
		return best;
	}

	void printStudentsInGroup() {
		for(int i = 0; i < this.students.length; i++) {
			System.out.println("Student name: " + this.students[i].getName() + ", student age: " + this.students[i].getAge()
					+ ", student grade: " + this.students[i].getGrade() + ", student money: " + this.students[i].getMoney()
					+ ", student year in college:" + this.students[i].getYearInCollege()
					+ ", " + this.students[i].isDegree());
		}
	}
}
