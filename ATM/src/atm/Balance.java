package atm;

public class Balance {

    private final  String name;
    private final  String actnumer;
    private   int balance;
    private final  String actType;

    public Balance(String name, String actnumer, int balance, String actType) {
        this.name = name;
        this.actnumer = actnumer;
        this.balance = balance;
        this.actType = actType;
    }

    public String getName() {
        return name;
    }

    public String getActnumer() {
        return actnumer;
    }

    public int getBalance() {
        return balance;
    }

    public String getActType() {
        return actType;
    }

    @Override
    public String toString() {
            return "Balance{" +
                    "name='" + name + '\'' +
                    ", actnumer='" + actnumer + '\'' +
                    ", balance=" + balance +
                    ", actType='" + actType + '\'' +
                    '}';
    }

    public void addBalance(int add){
        this.balance += add;
    }

    public void subBalance(int sub){
        this.balance -= sub;
    }
}
