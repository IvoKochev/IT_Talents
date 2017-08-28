import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		String[] names = {"Ivo", "Pesho", "Ivan", "Petyr", "Misho"};
		String[] addresses = {"Sofia", "Plovdiv", "Varna", "Burgas", "Lovech"};
		Set<Juror> jurors = new HashSet<Juror>();
		for(int i = 0; i < 3; i++) {
			jurors.add(((Juror)new Judge(names[new Random().nextInt(5)], addresses[new Random().nextInt(5)],
					new Random().nextInt((40)+20), new Random().nextInt(10)+5, new Random().nextInt(15))));
		}
		
		
		
		Court court = new Court();
		

	}

}
