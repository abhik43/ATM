package states;

import atm.ATM;
import atm.Card;

import java.io.IOException;


public class AbstractState implements State {
    @Override
    public void idle(ATM atm) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }

    @Override
    public void putAtmCard(ATM atm, Card card)throws IOException {
        throw  new UnsupportedOperationException("OperationNot supported");
    }

    @Override
    public void deposit(ATM atm, int money) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }


    @Override
    public void dispence(ATM atm, int money) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }

    @Override
    public void checkBalance(ATM atm) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }

    @Override
    public void dispenceATMCard(ATM atm) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }

    @Override
    public void exit(ATM atm) {
        throw  new UnsupportedOperationException("OperationNot supported");
    }
}
