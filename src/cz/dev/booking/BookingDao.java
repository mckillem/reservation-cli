package cz.dev.booking;

import java.util.UUID;

public class BookingDao {
	private final static Booking[] bookings;

	static {
		bookings = new Booking[10];
	}

	public Booking[] getBookings() {
		return bookings;
	}

	public void book(Booking booking) {
		int nextFreeIndex = -1;

		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i] == null) {
				nextFreeIndex = i;
			}
		}

		if (nextFreeIndex > -1) {
			bookings[nextFreeIndex] = booking;
			return;
		}

		// full array
		// copy all bookings to new array with bigger space
		Booking[] biggerBookings = new Booking[bookings.length + 10];

		for (int i = 0; i < bookings.length; i++) {
			biggerBookings[i] = bookings[i];
		}

		// finally add new booking
		biggerBookings[bookings.length] = booking;

	}

	public void cancelBooking(UUID id) {

	}
}
