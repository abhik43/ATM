package states;

import atm.ATM;
import atm.Card;
import atm.CardProxy;

import java.io.*;

public class PutATMCardState extends AbstractState {

    private CardProxy cardProxy = new CardProxy();

    @Override
    public void putAtmCard(ATM atm, Card card) throws IOException {
        if(cardProxy.validateCard(card) && cardProxy.validatePin(card)) {
            BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
            System.out.print("Enter your choice: 1.Checking Balance/ 2.Deposit/ 3.Dispence /4. Exit ");
            atm.setCard(card);
            String opt = br.readLine();
            if("1".equals(opt)) {
                atm.setState(new CheckbalanceState());
            }else if("2".equals(opt)) {
                atm.setState(new DepositState());
            }else if("3".equals(opt)) {
                atm.setState(new DispenceState());
            }else if("4".equals(opt)) {
                atm.setState(new DispenceATMCardState());
            }
        }else{
            System.out.println("Invalid Card. Please try again");
            atm.setState(new DispenceATMCardState());
        }
    }
}
