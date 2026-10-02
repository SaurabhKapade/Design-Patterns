package StateDesignPattern.ATMByStatePattern.services;

import StateDesignPattern.ATMByStatePattern.DTOs.GetATMAmountRequestDTO;
import StateDesignPattern.ATMByStatePattern.apis.BackendAPI;
import StateDesignPattern.ATMByStatePattern.apis.NodeBackendAPI;
import StateDesignPattern.ATMByStatePattern.models.ATM;

public class CashDispenserServiceImpl implements CashDispenserService{

    private final BackendAPI backendAPI;

    public CashDispenserServiceImpl(){
        this.backendAPI = new NodeBackendAPI();
    }
    @Override
    public void doTransaction(ATM atm, int amount) {
        int atmAmount = this.backendAPI.getATMAmount(new GetATMAmountRequestDTO(atm.getAtmId()));
        if(atmAmount < amount){
            throw new RuntimeException("ATM does not have enough cash to dispense");
        }
        System.out.println("Dispensing cash : "+ amount);
    }
}
