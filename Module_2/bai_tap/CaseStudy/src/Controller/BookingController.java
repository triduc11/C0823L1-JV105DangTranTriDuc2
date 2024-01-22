package Controller;

import Model.Booking;
import Service.impl.BookingService;

import java.util.TreeSet;

public class BookingController {
    BookingService bookingService =new BookingService();
    public TreeSet<Booking> findAll (){
        return bookingService.display();
    }
    public void add (Booking booking){
        bookingService.add(booking);
    }
    public Booking findByID (String id){
        return bookingService.findById(id);
    }
}
