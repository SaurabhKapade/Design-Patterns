package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.factories.CardManagerFactory;
import StateDesignPattern.ATMByStatePattern.models.ATM;
import StateDesignPattern.ATMByStatePattern.models.Card;
import StateDesignPattern.ATMByStatePattern.services.CardManagerService;
import StateDesignPattern.ATMByStatePattern.services.CashDispenserService;
import StateDesignPattern.ATMByStatePattern.services.CashDispenserServiceImpl;

public class DispensingCashState implements State{

    ATM atm;
    CashDispenserService cashDispenserService;
    public DispensingCashState(ATM atm){
        this.atm = atm;
        this.cashDispenserService = new CashDispenserServiceImpl();
    }
    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot init new transaction while dispensing cash");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, int pin) {
        throw new IllegalStateException("cannot read card details and pin while dispensing cash");
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isTransactionSuccessful = manager.doTransaction(card,amount,transactionId);
        if(isTransactionSuccessful){
            this.cashDispenserService.doTransaction(this.atm,amount);
        }
        this.atm.changeState(new EjectCardState(this.atm));

        return amount;
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException("cannot eject card while dispensing cash");
    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int amount, int transaction) {
        throw new IllegalStateException("cannot read cash withdrw details and pin while dispensing cash");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot cancel transaction while dispensing cash");
    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }
}
