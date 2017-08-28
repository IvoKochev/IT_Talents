import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Accuser extends Citizen implements ILegalEntity{
	private Set<Lawyer> lawyers = new HashSet<Lawyer>();
	
	public Accuser(String name, String address, int age, HashSet<Lawyer> lawyers) {
		super(name, address, age);
		if(lawyers != null) {
			this.lawyers = lawyers;
		}
	}

	public Set<Lawyer> getLawyers() {
		return lawyers;
	}

	@Override
	public void askQuestion(Citizen citizen) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeNotes() {
		// TODO Auto-generated method stub
		
	}
	

	
}
