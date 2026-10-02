package StateDesignPattern.ATMByStatePattern.models;

import StateDesignPattern.ATMByStatePattern.Enums.CardType;

public class Card {
    private final long cardNumber;
    private final int pin;
    private final String name;
    private final String bankName;
    private CardType cardType;

    public Card(long cardNumber,int pin,String name,CardType cardType,String bankName){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.bankName = bankName;
        this.cardType = cardType;
    }

    public long getCardNumber(){
        return this.cardNumber;
    }
    public int getPin(){
        return this.pin;
    }
    public String getName(){
        return this.name;
    }
    public String getBankName(){
        return this.bankName;
    }
    public CardType getCardType(){
        return this.cardType;
    }
}
