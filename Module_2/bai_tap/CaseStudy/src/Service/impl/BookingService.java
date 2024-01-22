package Service.impl;

import Model.Booking;
import Repository.impl.BookingRepository;

import java.util.TreeSet;

public class BookingService {
    BookingRepository bookingRepository = new BookingRepository();

    public void generateInvoice(Booking entity) {

    }


    public void add(Booking booking) {
        bookingRepository.add(booking);
    }


    public TreeSet<Booking> display() {
        return bookingRepository.display();
    }


    public Booking update(String id) {
        return null;
    }


    public void delete(String id) {
        bookingRepository.delete(id);
    }


    public Booking findById(String id) {
        return bookingRepository.findById(id);
    }
}
