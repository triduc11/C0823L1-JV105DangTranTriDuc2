package Repository.impl;

import Model.Contract;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class ContractRepository {
    private static Queue<Contract> contractQueue;
    static {
        contractQueue=new LinkedList<>();
    }

    public void calculatePayment(Contract entity) {
    }

    public void add(Contract contract) {
        contractQueue.add(contract);
    }

    public Queue<Contract> display() {
        return new LinkedList<>(contractQueue);
    }


    public Contract update(Contract contract) {
        Queue<Contract> tempQueue = new LinkedList<>();
        while (!contractQueue.isEmpty()) {
            Contract contract1 = contractQueue.poll();
            if (contract1.equals(contract)) {
                tempQueue.add(contract);
            } else {
                tempQueue.add(contract1);
            }
        }

        contractQueue.addAll(tempQueue);
        return contract;
    }


    public Contract findById(String bookingID) {
        Queue<Contract> list = contractQueue;
        for (Contract contract : list) {
            if (Objects.equals(contract.getBookingId(), bookingID)) {
                return contract;
            }
        }
        return null;
    }
}
