package states;

import atm.ATM;
import atm.CardProxy;

public class DepositState extends AbstractState{

    CardProxy cardProxy = new CardProxy();

    @Override
    public void deposit(ATM atm, int money) {
        cardProxy.deposit(atm.getCard(), money);
        atm.setState(new PutATMCardState());
    }
}
