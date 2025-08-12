package states;

import atm.ATM;
import atm.Card;

import java.io.IOException;

public interface State {

    public void idle(ATM atm);
    public void putAtmCard(ATM atm, Card card)throws IOException;
    public void deposit(ATM atm,int money);
    public void dispence(ATM atm,int money);
    public void checkBalance(ATM atm);
    public void dispenceATMCard(ATM atm);
    public void exit(ATM atm);
}
