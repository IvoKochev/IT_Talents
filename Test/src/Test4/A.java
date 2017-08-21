package Test4;

public abstract class A {
	String name;
	String color;
	
	public A(String name) {
		this.name = name;
		if(this instanceof B) {
			this.color = "blue";
		} else if(this instanceof C) {
			this.color = "red";
		}
	}

}
