package codeclan_cars.vehicles;

import codeclan_cars.vehicles.components.Engine;
import codeclan_cars.vehicles.components.PetrolEngine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private ArrayList<Tyre> tyres;
    private ArrayList<Seat> seats;

    public Vehicle(double price, String colour,Engine engine, Tyre tyre, Seat seat) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        tyres = new ArrayList<Tyre>();
        seats = new ArrayList<Seat>();
        for (int i = 0; i < 4; i++) {
            this.tyres.add(tyre);
            this.seats.add(seat);
        }
        this.seats.add(seat);
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyres.get(0);
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public Seat getSeat() {
        return seats.get(0);
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}
