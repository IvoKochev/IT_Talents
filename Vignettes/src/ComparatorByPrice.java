import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Vignette>{

	@Override
	public int compare(Vignette o1, Vignette o2) {
		return o1.getPrice(o1) - o2.getPrice(o2);
	}	

	
	

}
