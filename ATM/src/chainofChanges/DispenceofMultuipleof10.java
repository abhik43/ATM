package chainofChanges;

public class DispenceofMultuipleof10 extends Dispence{

    public DispenceofMultuipleof10(Dispence nextDispence) {
        super(nextDispence);
    }

    @Override
    public void dispence(int amount) {
        int numberOfNotes = amount / 10;
        int remainingAmount = amount % 10;
        if(numberOfNotes > 0) {
            System.out.println("Dispensing " + numberOfNotes + " notes of 10");
        }
    }
}
