import codeclan_cars.Customer;
import codeclan_cars.vehicles.Car;
import codeclan_cars.vehicles.components.PetrolEngine;
import codeclan_cars.vehicles.components.Seat;
import codeclan_cars.vehicles.components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Car car;
    private Seat seat;
    private Tyre tyre;
    private PetrolEngine petrolEngine;

    @Before
    public void setUp() {
        seat = new Seat();
        tyre = new Tyre();
        car = new Car(25000, "Red", petrolEngine, tyre, seat);
        customer = new Customer("Gullable Hugh", 100000);
    }

    @Test
    public void hasName() {
        assertEquals("Gullable Hugh", customer.getName());
    }

    @Test
    public void hasBigBucks() {
        assertEquals(100000, customer.getWallet(),0.0);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, customer.getCars().size());
    }

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.getCars().size());
    }

    @Test
    public void canSpendMoney() {
        customer.spendMoney(25000);
        assertEquals(75000, customer.getWallet(), 0.0);
    }
}
