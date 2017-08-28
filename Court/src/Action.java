import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class Action {
	private Judge judge;
	private Set<LegalEntity> jurors = new HashSet<LegalEntity>();
	private Set<Witness> witnesses = new HashSet<Witness>();
	private Defendant defendant;
	private Accuser accuser;
	
	public Action(Judge judge, 	HashSet<LegalEntity> jurors, HashSet<Witness> witnesses,
			Defendant defendant, Person accuser) {
		if(judge != null) {
			this.judge = judge;	
		}
		if(jurors != null) {
			if(this instanceof CivilianAction) {
				if(jurors.size() == 3) {
					this.jurors = jurors;
				} else {
					System.out.println("Invalid number of jurors!");
				}
			} else if(this instanceof CriminalAction) {
				if(jurors.size() == 13) {
					this.jurors = jurors;
				} else {
					System.out.println("Invalid number of jurors!");
				}
			}
			
		}
		if(witnesses != null) {
			this.witnesses = witnesses;
		}
		if(defendant != null) {
			this.defendant = defendant;
		}
		if(accuser != null) {
			if(this instanceof CriminalAction) {
				if(accuser instanceof Prosecutor) {
					this.accuser = (Accuser) accuser;
				} else {
					System.out.println("Inapropriate accuser!");
				}
			} else if(this instanceof CivilianAction) {
				if(accuser instanceof Citizen) {
					this.accuser = (Accuser) accuser;
				} else {
					System.out.println("Inapropriate accuser!");
				}
			}
			
		}
		
		
	}

	
	public void conduct() {
		for(LegalEntity j : jurors) {
			j.addInternship();
			j.addNumberOfActions();
		}
		for(Lawyer l : ((Defendant) this.defendant).getLawyers()) {
			l.addInternship();
			l.addNumberOfActions();
		}
		for(Lawyer lawyer : this.accuser.getLawyers()) {
			lawyer.addInternship();
			lawyer.addNumberOfActions();
		}
		
		if(this instanceof CivilianAction) {
			for(Lawyer lawyer : this.accuser.getLawyers()) {
				for(int i = 0; i < 3; i++) {
					lawyer.askQuestion(accuser);
				}
				for(Witness witness : witnesses) {
					lawyer.askQuestion(witness);
					lawyer.askQuestion(witness);
				}
			}
		} else {
			for(int i = 0; i < 5; i++) {
				this.accuser.askQuestion(defendant);
			}
			
			for(Witness witness : witnesses) {
				for(int i = 0; i < 5; i++) {
					this.accuser.askQuestion(witness);
				}
			}
		}
		
		for(Lawyer lawyer : this.defendant.getLawyers()) {
			for(Witness witness : witnesses) {
				lawyer.askQuestion(witness);
			}
		}
		
		if(isGuilty()) {
			this.takeDesicion();
		} else {
			System.out.println("The person: " + defendant.getName() + " is not guilty!");
		}
		
		
		
		
	}
	
	private boolean isGuilty() {
		int counterForYes = 0;
		for(int i = 0; i < this.jurors.size(); i++) {
			if(new Random().nextInt(2) == 1) {
				counterForYes++;
			}
		}
		boolean isGuilty = counterForYes > this.jurors.size() ? true : false;
		return isGuilty;
	}
	
	private void takeDesicion() {
		System.out.println("Judge: " + judge.getName() + " decided, that person: "
				+ defendant.getName() + " is guilty and has to go to prison"
						+ " for " + new Random().nextInt(38)+3 + " years!");
	}

}
