
public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if(subject != null && !subject.isEmpty()) {
			this.subject = subject;
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if(grade >= 2 && grade <= 6) {
			this.grade = grade;
		}
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		if(yearInCollege > 0 && yearInCollege < 5) {
			this.yearInCollege = yearInCollege;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 17 && age < 60) {
			this.age = age;
		}
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		this.isDegree = isDegree;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if(money >= 0) {
			this.money = money;
		}
	}

	Student() {
		this.setGrade(4);
		this.setYearInCollege(1);
		this.setDegree(false);
		this.setMoney(0);
	}
	
	Student(String name, String subject, int age) {
		this();
		this.setName(name);
		this.setSubject(subject);
		this.setAge(age);
	}


	
	void upYear() {
		if(!this.isDegree) {
			this.setYearInCollege(this.getYearInCollege()+1);;
		} else {
			System.out.println(this.getName() + " has already graduated with grade: " + this.getGrade());
		}
		if(this.getYearInCollege() == 4) {
			this.setDegree(true);
			System.out.println(this.getName() + " has succesfuly graduated with grade: " + this.getGrade());
		} else {
			System.out.println(this.getName() + " is in year: " + this.getYearInCollege() + " and has grade: " + this.getGrade());
		}
	}

	double receiveSchoolarship(double min, double amount) {
		if(this.getAge() < 30 && this.getGrade() > min && min <= 6 && min >= 2) {
			this.setMoney(getMoney() + amount);;
		} 
		return this.getMoney();
	}

	
}
