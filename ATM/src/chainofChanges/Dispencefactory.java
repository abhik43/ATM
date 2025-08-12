package chainofChanges;

public class Dispencefactory {

    public static Dispence getDispence() {
        return new DispenceofMultuipleof100(new DispenceofMultuipleof50(new DispenceofMultuipleof20(new DispenceofMultuipleof10(null))));
    }
}
