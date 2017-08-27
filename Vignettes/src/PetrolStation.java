import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PetrolStation implements IPetrolStation {
	private String name;
	private int money;
	private List<Vignette> vignettes = new ArrayList<Vignette>(10_000);
	
	public PetrolStation(String name, int money) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			this.name = "Ivo's petrol station";
		}
		if(money > 0) {
			this.money = money;
		} else {
			this.money = 1000;
		}
		
		this.vignettes = generateVignettes();
	}
	

	@Override
	public ArrayList<Vignette> generateVignettes() {
		Period[] periods = {Period.DAYLY, Period.MONTHLY, Period.YEARLY };
		List<Vignette> vignettes = new ArrayList<Vignette>(10_000);
		for (int i = 0; i < 10_000; i++) {
			switch (new Random().nextInt(3)) {
			case 0:
				Vignette carVignette = new CarVignette(LocalDate.now(), periods[new Random().nextInt(3)]);
				vignettes.add(carVignette);
				break;
			case 1:
				Vignette busVignette = new BusVignette(LocalDate.now(), periods[new Random().nextInt(3)]);
				vignettes.add(busVignette);
				break;
			case 2:
				Vignette truckVignette = new TruckVignette(LocalDate.now(), periods[new Random().nextInt(3)]);
				vignettes.add(truckVignette);
				break;
			}
		}
		//vignettes.sort(new ComparatorByPrice());
		
		return (ArrayList<Vignette>) vignettes;

	}

	public List<Vignette> getVignettes() {
		return vignettes;
	}


	@Override
	public void sellVignette(Car car, Period period) {
		
		
	}
	
	public void printInfo() {
		System.out.println("Pertol station: " );
		
		for(Vignette v : vignettes) {
			v.getInfo();
		}
		
		System.out.println(this.vignettes.size());
	}

	

	

}
