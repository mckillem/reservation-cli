package cz.dev.car;

import java.util.List;
import java.util.stream.Collectors;

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
		List<Car> electricCars = getAllCars()
				.stream()
				.filter(car -> car.isElectric())
				.collect(Collectors.toList());

		return electricCars;
	}
}
