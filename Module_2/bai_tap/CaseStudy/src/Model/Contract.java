package Model;

import java.util.Date;

public class Contract {
    private String contractNumber;
    private String bookingId;
    //tiền cọc trước
    private double depositAmount;
    private double totalAmount;
    private Date contractDate;

    public Contract(String contractNumber, String bookingId, double depositAmount, double totalAmount, Date contractDate) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.depositAmount = depositAmount;
        this.totalAmount = totalAmount;
        this.contractDate = contractDate;
    }

    // Getters and setters

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalAmount=" + totalAmount +
                ", contractDate=" + contractDate +
                '}';
    }
}