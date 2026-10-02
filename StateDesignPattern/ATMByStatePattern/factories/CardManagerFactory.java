package StateDesignPattern.ATMByStatePattern.factories;

import StateDesignPattern.ATMByStatePattern.Enums.CardType;
import StateDesignPattern.ATMByStatePattern.models.Card;
import StateDesignPattern.ATMByStatePattern.services.CardManagerService;
import StateDesignPattern.ATMByStatePattern.services.CreditCardManagerService;
import StateDesignPattern.ATMByStatePattern.services.DebitCardManagerService;

public class CardManagerFactory {
    public static CardManagerService getCardManager(CardType cardType){
        CardManagerService cardManagerService = null;
        if(cardType.equals(CardType.DEBIT)){
            cardManagerService = new DebitCardManagerService();
        }else if(cardType.equals(CardType.CREDIT)){
            cardManagerService = new CreditCardManagerService();
        }else{
            throw new IllegalArgumentException("Invalid Card");
        }
        return cardManagerService;
    }
}
