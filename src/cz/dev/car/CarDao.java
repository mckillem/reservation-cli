package cz.dev.car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarDao {
	private static final List<Car> CARS = Arrays.asList(
			new Car("1B4-1254", new BigDecimal("500.00"), Brand.TESLA, true),
			new Car("1B3-5678", new BigDecimal("360.00"), Brand.ŠKODA, false),
			new Car("2A5-5678", new BigDecimal("1050.00"), Brand.PORSCHE, false)
	);

	public List<Car> getAllCars() {
		return CARS;
	}
}
