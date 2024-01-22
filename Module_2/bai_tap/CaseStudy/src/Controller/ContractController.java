package Controller;

import Model.Contract;
import Service.impl.ContractService;

import java.util.Queue;

public class ContractController {
    ContractService contractService=new ContractService();
    public void add (Contract contract){
        contractService.add(contract);
    }
    public Queue<Contract> display (){
        return contractService.display();
    }
    public Contract findByID (String id){
        return contractService.findById(id);
    }
    public String update(String id){
        Contract contract=contractService.findById(id);
        if (contract!=null){
            contractService.update(id);
            return "Update successfully" ;
        }else {
            return "Facility ServiceCode does not exist";
        }
    }
}
