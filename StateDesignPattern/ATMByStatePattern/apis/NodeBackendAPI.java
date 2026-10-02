package StateDesignPattern.ATMByStatePattern.apis;

import StateDesignPattern.ATMByStatePattern.DTOs.CreateTransactionRequestDTO;
import StateDesignPattern.ATMByStatePattern.DTOs.GetATMAmountRequestDTO;

public class NodeBackendAPI implements BackendAPI{

    @Override
    public int createTransaction(CreateTransactionRequestDTO createTransactionRequestDTO) {
        // validate request body
        return (int)(Math.random()*1000);
    }

    @Override
    public int getATMAmount(GetATMAmountRequestDTO getATMAmountRequestDTO) {
        return 10000;
    }
}
