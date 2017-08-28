import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Defendant extends Citizen{
	private Set<Lawyer> lawyers = new HashSet<Lawyer>();

	public Defendant(String name, String address, int age, HashSet<Lawyer> lawyers) {
		super(name, address, age);
		if(lawyers != null) {
			this.lawyers = lawyers;
		}
		
	}

	public Set<Lawyer> getLawyers() {
		return lawyers;
	}
	
	

}
