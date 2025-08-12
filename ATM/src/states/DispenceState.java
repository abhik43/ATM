package states;

import atm.ATM;
import atm.CardProxy;
import chainofChanges.Dispence;
import chainofChanges.Dispencefactory;

public class DispenceState extends AbstractState{

    private CardProxy cardProxy = new CardProxy();

    private Dispence dispence = Dispencefactory.getDispence();

    @Override
    public void dispence(ATM atm, int money) {
        if(money%10 != 0){
            System.out.println("Please enter amount in multiple of 10,20,50,100");
            atm.setState(new PutATMCardState());
            return;
        }
        dispence.dispence(money);
        cardProxy.withdraw(atm.getCard(), money);
        atm.setState(new PutATMCardState());
    }
}
