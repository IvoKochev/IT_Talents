
public class Person {
	private String name;
	private int age;
	private double money;
	Person(String name, int age, double money) {
		if(name != null && !name.equals("")) {
			this.name = name;
		}
		if(age > 0 && age < 100) {
			this.age = age;
		} else {
			this.age = 18;
		}
		if(money >= 0) {
			this.money = money;
		} else {
			this.money = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
