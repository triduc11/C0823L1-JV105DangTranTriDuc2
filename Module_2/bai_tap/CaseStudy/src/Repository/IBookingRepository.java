package Repository;

public interface IBookingRepository<T> extends IRepository<T> {
    //tạo hóa đơn
    void generateInvoice(T entity);
}
