package Service;

public interface IContractService<T> extends IService<T> {
    //tính toán thanh toán
    void calculatePayment(T entity);
}
