package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.DTOs.CreateTransactionRequestDTO;
import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.apis.BackendAPI;
import StateDesignPattern.ATMByStatePattern.apis.NodeBackendAPI;
import StateDesignPattern.ATMByStatePattern.models.ATM;
import StateDesignPattern.ATMByStatePattern.models.Card;

public class ReadyForTransactionState implements State{

    ATM atm;
    BackendAPI backendAPI;
    public ReadyForTransactionState(ATM atm){
        this.atm = atm;
        this.backendAPI = new NodeBackendAPI();
    }
    @Override
    public int initTransaction() {
        CreateTransactionRequestDTO dto = new CreateTransactionRequestDTO(this.atm.getAtmId());
//        int tran
        // create transaction
        int transactionId = backendAPI.createTransaction(dto);

        // after that move to next state
        this.atm.changeState(new ReadCardDetailsAndPinState(this.atm));
        return transactionId;
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, int pin) {
        throw new IllegalStateException("Cannot read card details without inserting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispenseCash without inserting card");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("Cannot eject card without inserting card");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int amount, int transaction) {
        throw new IllegalStateException("Cannot read cash withdraw details without inserting card");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction without inserting card");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
