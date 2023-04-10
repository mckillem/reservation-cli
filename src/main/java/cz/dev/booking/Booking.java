package cz.dev.booking;

import cz.dev.car.Car;
import cz.dev.user.User;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Booking {

	private UUID id;
	private User user;
	private Car car;

	private LocalDateTime bookingTime;
	private boolean isCanceled;

	public Booking(UUID id, User user, Car car, LocalDateTime bookingTime, boolean isCanceled) {
		this.id = id;
		this.user = user;
		this.car = car;
		this.bookingTime = bookingTime;
		this.isCanceled = isCanceled;
	}

	public Booking(UUID id, User user, Car car, LocalDateTime bookingTime) {
		this(id, user, car, bookingTime, false);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setCanceled(boolean canceled) {
		isCanceled = canceled;
	}

	@Override
	public String toString() {
		return "Booking{" +
				"id=" + id +
				", user=" + user +
				", car=" + car +
				", bookingTime=" + bookingTime +
				", isCanceled=" + isCanceled +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Booking that = (Booking) o;
		return isCanceled == that.isCanceled && Objects.equals(id, that.id) && Objects.equals(user, that.user) && Objects.equals(car, that.car) && Objects.equals(bookingTime, that.bookingTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, user, car, bookingTime, isCanceled);
	}
}
