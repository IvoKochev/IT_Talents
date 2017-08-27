import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {

		PetrolStation petrolStation = new PetrolStation("OMV", 1000);
		// petrolStation.printInfo();
		String[] names = { "Ivan", "Pesho", "Ivo", "Gosho", "Stefan" };
		List<Driver> drivers = new ArrayList<Driver>(20);
		for (int i = 0; i < 20; i++) {
			drivers.add(new Driver(names[new Random().nextInt(5)], new Random().nextDouble(), petrolStation));
		}

		String[] models = { "BMW", "Mercedes", "Opel", "Ford" };
		for (int i = 0; i < 200; i++) {
			switch (new Random().nextInt(3)) {
			case 0:
				drivers.get(i / 20).buyVehicle(
						new Car(models[new Random().nextInt(4)], new Random().nextInt(67) + 1950, drivers.get(i / 20)));
				break;
			case 1:
				drivers.get(i / 20).buyVehicle(new Truck(models[new Random().nextInt(4)],
						new Random().nextInt(67) + 1950, drivers.get(i / 20)));
				break;
			case 2:
				drivers.get(i / 20).buyVehicle(
						new Bus(models[new Random().nextInt(4)], new Random().nextInt(67) + 1950, drivers.get(i / 20)));
				break;
			}
		}

		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0) {
				int counter = 0;
				do {
					if (drivers.get(i).buyVignette(drivers.get(i).getVehicles(new Random().nextInt(10)))) {
						counter++;
					}

				} while (counter < 5);
			} else {
				for (int j = 0; j < 20; j++) {
					drivers.get(i).buyVignette(drivers.get(i).getVehicles(j));
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (drivers.get(3).getVehicles(i).getViggnette() != null) {
				drivers.get(3).getVehicles(i).getViggnette().getInfo();
			}

		}

		
		System.out.println("Trucks with invalid vignettes: ");
		for (Driver d : drivers) {
			for (Vehicle v : d.getVehicles()) {
				if (v instanceof Truck && v.getViggnette() != null) {
					switch (v.getViggnette().getPeriod()) {
					case DAYLY:
						if (v.getViggnette().getDate().plusDays(7).isAfter(LocalDate.now())) {
							System.out.println(v.toString());
						}
						break;
					case MONTHLY:
						if (v.getViggnette().getDate().plusDays(7).isAfter(LocalDate.now())) {
							System.out.println(v.toString());
						}
						break;
					case YEARLY:
						if (v.getViggnette().getDate().plusDays(7).isAfter(LocalDate.now())) {
							System.out.println(v.toString());
						}
						break;
					}
				}
			}
		}

	}

}
