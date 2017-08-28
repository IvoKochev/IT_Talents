import java.util.HashSet;

public class CriminalAction extends Action{

	public CriminalAction(Judge judge, HashSet<LegalEntity> jurors, HashSet<Witness> witnesses, Defendant defendant,
			Accuser accuser) {
		super(judge, jurors, witnesses, defendant, accuser);
		
	}
	

}
