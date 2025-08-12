package atm;

import states.*;

public class ATM {
    private State state = new AbstractState();

    private Card card  = null;


    public void setState(State state) { this.state = state; }

    public State getState() { return state; }

    public void setCard(Card card) { this.card = card; }

    public Card getCard() {
        return card;
    }

}
