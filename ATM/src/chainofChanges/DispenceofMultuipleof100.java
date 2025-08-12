package chainofChanges;

public class DispenceofMultuipleof100 extends Dispence{

    public DispenceofMultuipleof100(Dispence nextDispence) {
        super(nextDispence);
    }

    @Override
    public void dispence(int amount) {
        int numberOfNotes = amount / 100;
        int remainingAmount = amount % 100;
        if(numberOfNotes > 0) {
            System.out.println("Dispensing " + numberOfNotes + " notes of 100");
            super.dispence(remainingAmount);
        }else{
            super.dispence(amount);
        }
    }
}
