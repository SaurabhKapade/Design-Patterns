package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.models.Card;

public interface State {
    int initTransaction();
    boolean readCardDetailsAndPin(Card card,int pin);
    int dispenseCash(Card card,int amount,int transactionId);
    void ejectCard();
    boolean readCashWithdrawDetails(Card card,int amount,int transaction);
    boolean cancelTransaction(int transactionId);
    ATMState getState();
}
