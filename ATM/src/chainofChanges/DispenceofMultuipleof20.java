package chainofChanges;

public class DispenceofMultuipleof20 extends Dispence{

    public DispenceofMultuipleof20(Dispence nextDispence) {
        super(nextDispence);
    }

    @Override
    public void dispence(int amount) {
        int numberOfNotes = amount / 20;
        int remainingAmount = amount % 20;
        if(numberOfNotes > 0) {
            System.out.println("Dispensing " + numberOfNotes + " notes of 20");
            super.dispence(remainingAmount);
        }else{
            super.dispence(amount);
        }

    }
}
