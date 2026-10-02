package StateDesignPattern.ATMByStatePattern.services;

import StateDesignPattern.ATMByStatePattern.models.Card;

public interface CardManagerService {
    boolean validateCard(Card card, int pin);

    boolean validateWithdrawal(int transactionId,int amount);

    boolean doTransaction(Card card,int amount,int transactionId);

}
