package Repository.impl;

import Model.Contract;
import Model.Employee;
import Repository.IContractRepository;

import java.util.ArrayList;

public class ContractRepository implements IContractRepository<Contract> {
    @Override
    public void calculatePayment(Contract entity) {

    }

    @Override
    public void add(Contract entity) {

    }

    @Override
    public ArrayList<Contract> display() {
        ArrayList<Contract> contracts =new ArrayList<>();
        return contracts ;
    }

    @Override
    public Contract update(Contract entity) {

        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Contract findById(String id) {
        return null;
    }
}
