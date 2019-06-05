package codeclan_cars.vehicles;

import codeclan_cars.vehicles.components.ElectricEngine;
import codeclan_cars.vehicles.components.Engine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;

public class ElectricCar extends Vehicle {

    private ElectricEngine engine;

    public ElectricCar(double price, String colour, ElectricEngine engine, Tyre tyre, Seat seat) {
        super(price, colour, engine, tyre, seat);
    }

}
