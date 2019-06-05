package codeclan_cars;

public class Dealer {

    private String name;
    private double wallet;

    public Dealer(String name) {
        this.name = name;
        this.wallet = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void earnsCommision(double commission) {
        this.wallet += commission;
    }
}
