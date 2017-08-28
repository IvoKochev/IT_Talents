
public abstract class LegalEntity extends Citizen implements ILegalEntity{
	private int internship;
	private int numberOfActions;
	
	public LegalEntity(String name, String address, int age, int internship, int numberOfActions) {
		super(name, address, age);
		if(this instanceof Judge) {
			if(internship >= 5) {
				this.internship = internship;
			} else {
				this.internship = 5;
			}
		} else if(this instanceof Prosecutor) {
			if(internship >= 10) {
				this.internship = internship;
			} else {
				this.internship = 10;
			}
		} else {
			this.internship = internship;
		}
		
		if(this instanceof Lawyer) {
			if(numberOfActions >= 10) {
				this.numberOfActions = numberOfActions;
			} else {
				this.numberOfActions = 10;
			}
		} else {
			this.numberOfActions = numberOfActions;
		}
		
	}

	
	
	
	

	@Override
	public void makeNotes() {
		// TODO Auto-generated method stub
		
	}
	
	public void addInternship() {
		this.internship++;
	}
	
	public void addNumberOfActions() {
		this.numberOfActions++;
	}






	@Override
	public void askQuestion(Citizen citizen) {
		
		
	}


	
	
	
	
	

}
