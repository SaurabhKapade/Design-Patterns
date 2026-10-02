package StateDesignPattern.ATMByStatePattern.models;

import StateDesignPattern.ATMByStatePattern.Enums.CardType;

public class VisaDebitCard extends Card implements Debit,Visa{

    public VisaDebitCard(long cardNumber, int pin, String name, CardType cardType, String bankName) {
        super(cardNumber, pin, name, cardType, bankName);
    }

    @Override
    public void makePinPayment() {
        this.connectToVisaServer();
        System.out.println("Making payment with pin");
    }

    @Override
    public void connectToVisaServer() {
        System.out.println("connecting to visa server");
    }
}
