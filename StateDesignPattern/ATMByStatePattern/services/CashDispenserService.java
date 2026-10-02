package StateDesignPattern.ATMByStatePattern.services;

import StateDesignPattern.ATMByStatePattern.models.ATM;

public interface CashDispenserService {
    public void doTransaction(ATM atm,int amount);
}
