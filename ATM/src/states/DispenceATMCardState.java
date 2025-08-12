package states;

import atm.ATM;

public class DispenceATMCardState extends AbstractState{
    @Override
    public void dispenceATMCard(ATM atm) {
        System.out.println("Thank you. Please take your card.");
        atm.setCard(null);
        atm.setState(new ExitState());
    }
}
