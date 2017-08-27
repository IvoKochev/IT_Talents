import java.util.ArrayList;
import java.util.List;

public interface IPetrolStation {
	List<Vignette> generateVignettes();
	void sellVignette(Car car, Period period);

}
