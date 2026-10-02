package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.models.ATM;
import StateDesignPattern.ATMByStatePattern.models.Card;

public class EjectCardState implements State{

    ATM atm;
    public EjectCardState(ATM atm){
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("Cannot init transaction while ejecting card");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, int pin) {
        throw new IllegalStateException("Cannot read card details and pin while ejecting card");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("Cannot dispense cash while ejecting card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        this.atm.changeState(new ReadyForTransactionState(this.atm));
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int amount, int transaction) {
        throw new IllegalStateException("Cannot read cash withdraw details while ejecting card");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("Cannot cancel transaction while ejecting card");
    }

    @Override
    public ATMState getState() {
        return ATMState.EJECTING_CARD;
    }
}
