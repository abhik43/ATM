package chainofChanges;

public class DispenceofMultuipleof50 extends Dispence{

    public DispenceofMultuipleof50(Dispence nextDispence) {
        super(nextDispence);
    }

    @Override
    public void dispence(int amount) {
        int numberOfNotes = amount / 50;
        int remainingAmount = amount % 50;
        if(numberOfNotes > 0) {
            System.out.println("Dispensing " + numberOfNotes + " notes of 50");
            super.dispence(remainingAmount);
        }else{
            super.dispence(amount);
        }
        super.dispence(remainingAmount);
    }
}
