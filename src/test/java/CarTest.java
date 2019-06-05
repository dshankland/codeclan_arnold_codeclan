import codeclan_cars.vehicles.Car;
import codeclan_cars.vehicles.components.Engine;
import codeclan_cars.vehicles.components.PetrolEngine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private PetrolEngine petrolEngine;
    private Seat seat;
    private Tyre tyre;

    @Before
    public void setUp() {
        petrolEngine = new PetrolEngine();
        seat = new Seat();
        tyre = new Tyre();
        car = new Car(25000, "Red", petrolEngine, tyre, seat);
    }

    @Test
    public void hasColour() {
        assertEquals("Red", car.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(25000, car.getPrice(), 0.0);
    }

    @Test
    public void hasPetrolEngine() {
        assertEquals(petrolEngine, car.getEngine());
    }

    @Test
    public void has4seats() {
        assertEquals(5, car.getSeats().size());
    }

    @Test
    public void has4Tyres() {
        assertEquals(4, car.getTyres().size());
    }
}
