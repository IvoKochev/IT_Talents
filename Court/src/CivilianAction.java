import java.util.HashSet;

public class CivilianAction extends Action{
	
	public CivilianAction(Judge judge, HashSet<LegalEntity> jurors, HashSet<Witness> witnesses, Defendant defendant,
			Accuser accuser) {
		super(judge, jurors, witnesses, defendant, accuser);
		
	}

}
