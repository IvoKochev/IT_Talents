
public class Citizen extends Person{
	private String address;
	private int age;
	
	public Citizen(String name, String address, int age) {
		super(name);
		if(address != null && !address.isEmpty()) {
			this.address = address;
		} else {
			this.address = "Sofia, Studentski grad";
		}
		if(age > 12 && age < 100) {
			this.age = age;
		} else {
			age = 20;
		}
	}

}
