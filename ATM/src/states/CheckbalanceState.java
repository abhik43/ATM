package states;

import atm.ATM;
import atm.Balance;
import atm.CardProxy;

public class CheckbalanceState  extends AbstractState {

    private CardProxy cardProxy = new CardProxy();
    @Override
    public void checkBalance(ATM atm) {
        Balance balance = cardProxy.getBalance(atm.getCard());
        System.out.println(balance.toString());
        if(balance==null){
            atm.setState(new DispenceATMCardState());
        }else{
            atm.setState(new PutATMCardState());
        }
    }
}
