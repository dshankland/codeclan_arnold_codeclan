package codeclan_cars;

import codeclan_cars.vehicles.Car;
import codeclan_cars.vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private Till till;
    private ArrayList<Dealer> dealers;
    private String name;
    private double startingBalance;

    public Dealership(String name, double startingBalance) {
        this.name = name;
        this.till = new Till(startingBalance);
        this.dealers = new ArrayList<Dealer>();
        this.stock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return till.getBalance();
    }

    public void addStock(Vehicle vehicle) {
        this.stock.add(vehicle);
        this.till.removeMoney(vehicle.getPrice());
    }

    public void addDealer(Dealer dealer) {
        this.dealers.add(dealer);
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public ArrayList<Dealer> getDealers() {
        return dealers;
    }

    public int countStock() {
        return this.getStock().size();
    }

    public Vehicle removeStock(Vehicle vehicle) {
        int index = this.getStock().indexOf(vehicle);
        return this.stock.remove(index);
    }

    public void sellsCar(Vehicle vehicle, Customer customer, Dealer dealer) {
        double commission = 0.05 * vehicle.getPrice();
        double dealershipSale = vehicle.getPrice() - commission;
        if (customer.getWallet() >= vehicle.getPrice()) {
            customer.spendMoney(vehicle.getPrice());
            this.earnMoney(dealershipSale);
            customer.addCar(removeStock(vehicle));
            dealer.earnsCommision(commission);
        }
    }

    private void earnMoney(double price) {
        this.till.addMoney(price);
    }
}
