package Repository;

public interface ICustomerRepository<T> extends IRepository<T> {
    //phân loại khách hàng
    void classifyCustomer (T entity);
}
