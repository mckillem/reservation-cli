package cz.dev.car;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

	private String registrationNumber;
	private BigDecimal rentalPricePerDay;
	private Brand brand;
	private boolean isElectric;

	public Car() {
	}

	public Car(String registrationNumber, BigDecimal rentalPricePerDay, Brand brand, boolean isElectric) {
		this.registrationNumber = registrationNumber;
		this.rentalPricePerDay = rentalPricePerDay;
		this.brand = brand;
		this.isElectric = isElectric;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public BigDecimal getRentalPricePerDay() {
		return rentalPricePerDay;
	}

	public void setRentalPricePerDay(BigDecimal rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}

	public boolean isElectric() {
		return isElectric;
	}

	public void setElectric(boolean electric) {
		isElectric = electric;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return isElectric == car.isElectric && brand == car.brand && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(rentalPricePerDay, car.rentalPricePerDay);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, registrationNumber, rentalPricePerDay, isElectric);
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand=" + brand +
				", registrationNumber='" + registrationNumber + '\'' +
				", rentalPricePerDay=" + rentalPricePerDay +
				", isElectric=" + isElectric +
				'}';
	}
}
