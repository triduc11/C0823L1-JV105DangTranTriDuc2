package Service;

public interface IBookingService<T> extends IService<T> {
    //tạo hóa đơn
    void generateInvoice(T entity);
}
