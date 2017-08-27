import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	private String name;
	private double money;
	private PetrolStation petrolStation;
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Driver(String name, double money, PetrolStation petrolStation) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		if (money > 0) {
			this.money = money;
		}
		if (petrolStation != null) {
			this.petrolStation = petrolStation;
		}
	}

	public void buyVehicle(Vehicle vehicle) {
		if (vehicle != null)
			this.vehicles.add(vehicle);

	}

	public void showVehicles() {
		vehicles.forEach(p -> System.out.println(p.toString()));
	}

	public boolean buyVignette(Vehicle vehicle) {
		if (vehicle.getViggnette() == null) {
			if (vehicle instanceof Car) {
				for (Vignette v : this.petrolStation.getVignettes()) {
					if (v instanceof CarVignette) {
						vehicle.addVegnette(v);
						this.petrolStation.getVignettes().remove(v);
						return true;
					}
				}
			} else if (vehicle instanceof Bus) {
				for (Vignette p : this.petrolStation.getVignettes()) {
					if (p instanceof BusVignette) {
						vehicle.addVegnette(p);
						this.petrolStation.getVignettes().remove(p);
						return true;
					}
				}
			} else {
				for (Vignette s : this.petrolStation.getVignettes()) {
					if (s instanceof TruckVignette) {
						vehicle.addVegnette(s);
						this.petrolStation.getVignettes().remove(s);
						return true;
					}
				}
			}
		}

		return false;
	}

	public Vehicle getVehicles(int index) {
		return vehicles.get(index);
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void printInfo() {
		System.out.println("Number of vehicles: " + this.vehicles.size() + "\nMoney: " + this.money);
		int counter = 0;
		for (Vehicle v : vehicles) {
			switch (v.getViggnette().getPeriod()) {
			case DAYLY:
				if ((v.getViggnette().getDate().plusDays(7).isAfter(LocalDate.now()))) {
					counter++;
				}
			case MONTHLY:
				if ((v.getViggnette().getDate().plusDays(31).isAfter(LocalDate.now()))) {
					counter++;
				}
			case YEARLY:
				if ((v.getViggnette().getDate().plusYears(1).isAfter(LocalDate.now()))) {
					counter++;
				}

			}
		}
		System.out.println("Vehicles with invalid vignettes: " + counter);

	}
}
