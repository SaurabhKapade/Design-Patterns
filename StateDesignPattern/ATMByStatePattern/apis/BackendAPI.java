package StateDesignPattern.ATMByStatePattern.apis;

import StateDesignPattern.ATMByStatePattern.DTOs.CreateTransactionRequestDTO;
import StateDesignPattern.ATMByStatePattern.DTOs.GetATMAmountRequestDTO;

public interface BackendAPI {
    public int createTransaction(CreateTransactionRequestDTO createTransactionRequestDTO);

    public int getATMAmount(GetATMAmountRequestDTO getATMAmountRequestDTO);
}
