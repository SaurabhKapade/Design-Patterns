package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.factories.CardManagerFactory;
import StateDesignPattern.ATMByStatePattern.models.ATM;
import StateDesignPattern.ATMByStatePattern.models.Card;
import StateDesignPattern.ATMByStatePattern.services.CardManagerService;

public class ReadingCashWithdrawalDetails implements State{
    ATM atm;
    public ReadingCashWithdrawalDetails(ATM atm){
        this.atm = atm;
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot init new transaction while reading cash withdrw details");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, int pin) {
        throw new IllegalStateException("cannot read card details and pin while reading cash withdrw details");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("cannot dispense cash while reading cash withdraw details");
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card while reading cash withdrw details");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int amount, int transaction) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isValid = manager.validateWithdrawal(transaction,amount);
        if(isValid){
            this.atm.changeState(new DispensingCashState(this.atm));
        }else{
            this.atm.changeState(new EjectCardState(this.atm));
        }
        return isValid;
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        this.atm.changeState(new ReadyForTransactionState(this.atm));
        return true;
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CASH_WITHDRAW_DETAILS;
    }
}
