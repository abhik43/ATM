package atm;

public class CardServices {

    private static Balance  balance =  new Balance("Abhikumar", "1234567890", 1000, "Savings");

    private static CardServices cardServices = new CardServices();  //singleton

    public static CardServices getInstance() {
        return cardServices;
    }

    public static boolean validateCard(Card card) {
        return true;
    }

    public static boolean validatePin(Card card) {
        return true;
    }


    public static Balance getBalance(Card card) {
        if (validateCard(card) && validatePin(card)) {
            return balance;
        }
        throw new UnsupportedOperationException("Operation Not supported.Not a valid card");
    }

    public  static void withdraw(Card card, int amount) {
        balance = getBalance(card);
        if(balance==null ||balance.getBalance() < amount) {
            throw new UnsupportedOperationException("Operation Not supported.Not a valid card");
        }
        balance.subBalance(amount);
        System.out.println("Amount withdrawn successfully");
        System.out.println("Current balance: " + balance.getBalance());
    }

    public static void deposit(Card card, int amount) {
        balance = getBalance(card);
        if(balance==null) {
            throw new UnsupportedOperationException("Operation Not supported.Not a valid card");
        }
        balance.addBalance(amount);
        System.out.println("Amount deposited successfully");
        System.out.println("Current balance: " + balance.getBalance());
    }
}
