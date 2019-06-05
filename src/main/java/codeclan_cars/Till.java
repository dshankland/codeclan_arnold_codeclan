package codeclan_cars;

public class Till {

    private double balance;

    public Till(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double sum) {
        this.balance += sum;
    }

    public void removeMoney(double sum) {
        this.balance -= sum;
    }

}
