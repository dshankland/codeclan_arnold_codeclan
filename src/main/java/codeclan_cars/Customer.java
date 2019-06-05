package codeclan_cars;

import codeclan_cars.vehicles.Car;
import codeclan_cars.vehicles.Vehicle;
import sun.jvm.hotspot.jdi.ArrayReferenceImpl;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Vehicle> cars;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.cars = new ArrayList<Vehicle>();
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

    public ArrayList<Vehicle> getCars() {
        return cars;
    }


    public void addCar(Vehicle vehicle) {
        this.cars.add(vehicle);
    }

    public void spendMoney(double price) {
        this.wallet -= price;
    }
}
