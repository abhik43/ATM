package atm;

public class CardProxy {

    public boolean validateCard(Card card) {
        return CardServices.validateCard(card);
    }

    public boolean validatePin(Card card) {
        return CardServices.validatePin(card);
    }

    public Balance getBalance(Card card) {
        return CardServices.getBalance(card);
    }

    public void withdraw(Card card, int amount) {
        CardServices.withdraw(card, amount);
    }

    public void deposit(Card card, int amount) {
        CardServices.deposit(card, amount);
    }
}
