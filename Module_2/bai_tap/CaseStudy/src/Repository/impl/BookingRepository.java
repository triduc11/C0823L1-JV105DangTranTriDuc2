package Repository.impl;

import Model.Booking;
import Model.BookingComparator;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository {
    private static Set<Booking> bookings;

    static {
        bookings = new TreeSet<>(new BookingComparator());

    }

    public void add(Booking booking) {
        bookings.add(booking);
    }

    public TreeSet<Booking> display() {
        return new TreeSet<>(bookings);
    }

    public Booking update(Booking entity) {
        return null;
    }

    public void delete(String id) {
    }

    public Booking findById(String id) {
        TreeSet<Booking> list = display();
        for (Booking booking : list) {
            if (Objects.equals(booking.getBookingId(), id)) {
                return booking;
            }
        }
        return null;
    }
}
