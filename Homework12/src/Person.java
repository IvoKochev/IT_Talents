
public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	Person(String name, int age, boolean isMale) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Noname";
		}
		if(this instanceof Student) {
			if(age > 17 && age < 60) {
				this.age = age;
			} else {
				this.age = 18;
			}
		} else if(this instanceof Employee) {
			if(age >= 16 && age <60) {
				this.age = age;
			} else {
				this.age = 18;
			}
		} else  if(age > 0 && age < 100) {
		
			this.age = age;
		} else {
			this.age = 18;
		}
		
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 0 && age < 100) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}
	

	public void showPersonInfo() {
		System.out.println("Name: " + this.getName() + "\nAge: " + this.getAge() + "\nMale/Female: " + (this.isMale() == true ? "Male" : "Female"));
	}



	

	
	
	
	
 }
