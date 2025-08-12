package states;

import atm.ATM;

public class IdleState extends AbstractState {
    @Override
    public void idle(ATM atm) {
        System.out.println("ATM is Idle.Put your card and pin to continue");
        atm.setState(new PutATMCardState());
    }
}
