package chainofChanges;

public abstract class Dispence {

    Dispence next;

    Dispence(Dispence next) {
        this.next = next;
    }

    public Dispence getNext() {
        return next;
    }

    public void setNext(Dispence next) {
        this.next = next;
    }

    public void dispence(int money) {
        this.next.dispence(money);
    }
}
