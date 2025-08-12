import atm.ATM;
import atm.Card;
import states.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
        ATM atm = new ATM();
        atm.setState(new IdleState());
        atm.getState().idle(atm);
        Card card = new Card("1234567890", "1234");
        atm.setCard(card);
        atm.getState().putAtmCard(atm, card);
        while(true){
            if(atm.getState() instanceof CheckbalanceState){
                atm.getState().checkBalance(atm);
            }else if(atm.getState() instanceof DepositState){
                System.out.println("Enter amount to deposit: ");
                int amount = Integer.parseInt(br.readLine());
                atm.getState().deposit(atm,amount);
            }else if(atm.getState() instanceof DispenceState){
                System.out.println("Enter amount to dispence: ");
                int amount = Integer.parseInt(br.readLine());
                atm.getState().dispence(atm,amount);
            } else if(atm.getState() instanceof DispenceATMCardState){
                atm.getState().dispenceATMCard(atm);
            }else if(atm.getState() instanceof ExitState){
                atm.getState().exit(atm);
                break;
            }else if(atm.getState() instanceof PutATMCardState){
                atm.getState().putAtmCard(atm,card);
            }
        }
    }
}