package Service.impl;

import Model.Contract;
import Repository.impl.ContractRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Queue;
import java.util.Scanner;

public class ContractService {
    ContractRepository contractRepository = new ContractRepository();

    public void calculatePayment(Contract entity) {

    }

    public void add(Contract contract) {
        contractRepository.add(contract);
        System.out.println("Added successfully.");
    }

    public Queue<Contract> display() {
        return contractRepository.display();
    }


    public Contract update(String id) {
        Scanner scanner = new Scanner(System.in);
        Queue<Contract> list = display();
        System.out.println("1.Update contractDate");
        System.out.println("2.Update contractNumber");
        System.out.println("3.Update depositAmount");
        System.out.println("4.Update totalAmount");
        System.out.println("Choose option");
        for (Contract contract : list) {
            if (contract.getBookingId().equals(id)) {
                int n = Integer.parseInt(scanner.nextLine());
                switch (n) {
                    case 1:
                        System.out.println("-Updating contractDate");
                        String stringDate = scanner.nextLine();
                        Date date = null;
                        try {
                            date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
                        } catch (ParseException e) {
                            System.out.println("Invalid Date");
                        }
                        contract.setContractDate(date);
                        break;
                    case 2:
                        System.out.println("-Updating contractNumber");
                        contract.setContractNumber(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("-Updating depositAmount");
                        contract.setDepositAmount(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 4:
                        System.out.println("-Updating totalAmount");
                        contract.setTotalAmount(Double.parseDouble(scanner.nextLine()));
                        break;
                    default:
                        break;
                }
                return contractRepository.update(contract);
            }
        }
        return null;
    }

    public void delete(String id) {

    }

    public Contract findById(String id) {
        return contractRepository.findById(id);
    }
}
