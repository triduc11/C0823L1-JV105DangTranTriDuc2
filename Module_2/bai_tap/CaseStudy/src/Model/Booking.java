package Model;

import java.util.Date;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingId;
    private Date bookingDate;
    private Date startDate;
    private Date endDate;
    private String customerId;
    private String serviceId;

    public Booking(String bookingId, Date bookingDate, Date startDate, Date endDate, String customerId, String serviceId) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", customerId='" + customerId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Booking)) {
            return false;
        }
        Booking other = (Booking) obj;
        return customerId.equals(other.customerId) && serviceId.equals(other.serviceId)
                && startDate.equals(other.startDate) && endDate.equals(other.endDate);
    }


    @Override
    public int hashCode() {
        return Objects.hash(customerId, serviceId, startDate, endDate);
    }

    public int compareTo(Booking other) {
        int startDateComparison = this.startDate.compareTo(other.startDate);
        if (startDateComparison != 0) {
            return startDateComparison;
        }
        return this.endDate.compareTo(other.endDate);
    }
}
