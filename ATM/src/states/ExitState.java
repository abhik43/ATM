package states;

import atm.ATM;

public class ExitState extends AbstractState{


    @Override
    public void exit(ATM atm) {
        System.out.println("Exiting from ATM.now it is idle");
        atm.setState(new IdleState());
    }
}
