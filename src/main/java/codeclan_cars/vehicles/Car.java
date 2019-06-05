package codeclan_cars.vehicles;

import codeclan_cars.vehicles.components.Engine;
import codeclan_cars.vehicles.components.PetrolEngine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;

public class Car extends Vehicle {

    private PetrolEngine engine;

    public Car(double price, String colour, PetrolEngine engine, Tyre tyre, Seat seat) {
        super(price, colour, engine, tyre, seat);
    }

}
