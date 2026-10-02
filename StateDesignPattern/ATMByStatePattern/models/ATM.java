package StateDesignPattern.ATMByStatePattern.models;

import StateDesignPattern.ATMByStatePattern.Enums.ATMState;
import StateDesignPattern.ATMByStatePattern.states.State;

public class ATM {
    private final String atmId;
    private State state;

    public ATM(String atmId,State state){
        this.atmId = atmId;
        this.state = state;
    }
    public String getAtmId(){
        return this.atmId;
    }
    public void changeState(State newState){
        this.state = newState;
    }
}
