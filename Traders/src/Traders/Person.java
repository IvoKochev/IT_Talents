package Traders;

public abstract class Person {
	private String name;
	private String address;
	

	public Person(String name, String address) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Ivo";
		}
		if(address != null && !address.isEmpty()) {
			this.address = address;
		} else {
			this.address = "Sofia, Studentski grad";
		}
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}

	
	

}
