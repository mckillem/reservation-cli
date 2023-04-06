package cz.dev.car;

public class CarService {
	private final CarDao carDao = new CarDao();

	public Car[] getAllCars() {
		return carDao.getAllCars();
	}

	public Car getCar(String registrationNumber) {
		for (Car car : getAllCars()) {
			if (registrationNumber.equals(car.getRegistrationNumber())) {
				return car;
			}
		}
		throw new IllegalStateException(String.format("A car with a registration number %s not found", registrationNumber));
	}

	public Car[] getAllElectricCars() {
		int electricCarsCount = 0;

		Car[] cars = getAllCars();

		if (cars.length == 0) {
			return new Car[0];
		}

		for (Car car : cars) {
			if (car.isElectric()) {
				electricCarsCount++;
			}
		}

		if (electricCarsCount == 0) {
			return new Car[0];
		}

		Car[] electricCars = new Car[electricCarsCount];

		int index = 0;

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].isElectric()) {
				electricCars[index++] = cars[i];
			}
		}

		return electricCars;
	}
}
