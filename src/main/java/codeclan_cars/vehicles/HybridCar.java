package codeclan_cars.vehicles;

import codeclan_cars.vehicles.components.Engine;
import codeclan_cars.vehicles.components.HybridEngine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;

public class HybridCar extends Vehicle {

    private HybridEngine engine;

    public HybridCar(double price, String colour, HybridEngine engine, Tyre tyre, Seat seat) {
        super(price, colour, engine, tyre, seat);
    }

}
