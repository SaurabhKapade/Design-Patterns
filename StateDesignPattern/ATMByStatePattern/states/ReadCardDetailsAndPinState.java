package StateDesignPattern.ATMByStatePattern.states;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.factories.CardManagerFactory;
import StateDesignPattern.ATMByStatePattern.models.ATM;
import StateDesignPattern.ATMByStatePattern.models.Card;
import StateDesignPattern.ATMByStatePattern.services.CardManagerService;

public class ReadCardDetailsAndPinState implements State{

    ATM atm;
    public ReadCardDetailsAndPinState(ATM atm){
        this.atm = atm;
    }

    @Override
    public int initTransaction() {
        throw new IllegalStateException("cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean readCardDetailsAndPin(Card card, int pin) {
        CardManagerService manager = CardManagerFactory.getCardManager(card.getCardType());
        boolean isValid = manager.validateCard(card,pin);
        if(isValid){
            this.atm.changeState(new ReadingCashWithdrawalDetails(this.atm));
        }else{
            this.atm.changeState(new EjectCardState(this.atm));
        }
        return isValid;
    }

    @Override
    public int dispenseCash(Card card, int amount, int transactionId) {
        throw new IllegalStateException("cannot init transaction while reading card details and pin");
    }

    @Override
    public void ejectCard() {

    }

    @Override
    public boolean readCashWithdrawDetails(Card card, int amount, int transaction) {
        throw new IllegalStateException("cannot init transaction while reading card details and pin");
    }

    @Override
    public boolean cancelTransaction(int transactionId) {
        throw new IllegalStateException("cannot init transaction while reading card details and pin");
    }

    @Override
    public ATMState getState() {
        return ATMState.READ_CARD_DETAILS_AND_PIN;
    }
}
