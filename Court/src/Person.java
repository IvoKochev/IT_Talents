
public abstract class Person {
	private String name;
	
	public Person(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Ivo";
		}
	}

	public String getName() {
		return name;
	}
	
	

}
