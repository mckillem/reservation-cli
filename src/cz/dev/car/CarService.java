package cz.dev.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {
	private final CarDao carDao;

	public CarService(CarDao carDao) {
		this.carDao = carDao;
	}

	public List<Car> getAllCars() {
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

	public List<Car> getAllElectricCars() {
		List<Car> cars = getAllCars();

		if (cars.size() == 0) {
			return Collections.emptyList();
		}

		List<Car> electricCars = new ArrayList<>();

		for (Car car : cars) {
			if (car.isElectric()) {
				electricCars.add(car);
			}
		}

		return electricCars;
	}
}
