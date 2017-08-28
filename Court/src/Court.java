import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Court {
	private String name;
	private String address;
	private Set<LegalEntity> legalEntities = new HashSet<LegalEntity>();
	private Set<Action> actions = new HashSet<Action>();
	public Court(String name, String address, Set<LegalEntity> legalEntities, Set<Action> actions) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
		if(address != null && !address.isEmpty()) {
			this.address = address;
		}
		this.legalEntities = legalEntities;
		this.actions = actions;
	}
	

	
	

}
