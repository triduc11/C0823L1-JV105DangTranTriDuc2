package Model;

import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {
    public int compare(Booking booking1, Booking booking2) {
        // So sánh theo ngày bắt đầu booking
        int startDateComparison = booking1.getStartDate().compareTo(booking2.getStartDate());
        if (startDateComparison != 0) {
            return startDateComparison;
        }

        // Trường hợp ngày bắt đầu booking trùng nhau, sắp xếp theo ngày kết thúc booking
        return booking1.getEndDate().compareTo(booking2.getEndDate());
    }
}
