package Repository;

public interface IContractRepository<T> extends IRepository<T> {
    //tính toán thanh toán
    void calculatePayment(T entity);
}
