package Repository.impl;

import Model.Booking;
import Model.BookingComparator;
import Model.Employee;
import Repository.IBookingRepository;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository  {
    private static Set<Booking> bookings;

    static {
        bookings = new TreeSet<>(new BookingComparator());
    }

    public void generateInvoice(Booking entity) {

    }


    public void add(Booking booking) {
        bookings.add(booking);
    }

    public Set<Booking> display() {
        return  bookings;
    }

    public Booking update(Booking entity) {

        return null;
    }

    public void delete(String id) {

    }

    public Booking findById(String id) {
        return null;
    }
}
