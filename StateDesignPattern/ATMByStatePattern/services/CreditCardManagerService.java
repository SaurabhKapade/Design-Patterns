package StateDesignPattern.ATMByStatePattern.services;

import StateDesignPattern.ATMByStatePattern.models.Card;

public class CreditCardManagerService implements CardManagerService{
    @Override
    public boolean validateCard(Card card, int pin) {
        return true;
    }

    @Override
    public boolean validateWithdrawal(int transactionId, int amount) {
        return true;
    }

    @Override
    public boolean doTransaction(Card card, int amount, int transactionId) {
        return true;
    }
}
