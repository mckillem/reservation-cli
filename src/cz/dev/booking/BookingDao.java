package cz.dev.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookingDao {
	private final static List<Booking> bookings;

	static {
		bookings = new ArrayList<Booking>();
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void book(Booking booking) {
		bookings.add(booking);
	}

	public void cancelBooking(UUID id) {

	}
}
