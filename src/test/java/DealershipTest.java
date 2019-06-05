import codeclan_cars.Customer;
import codeclan_cars.Dealer;
import codeclan_cars.Dealership;
import codeclan_cars.vehicles.Car;
import codeclan_cars.vehicles.ElectricCar;
import codeclan_cars.vehicles.HybridCar;
import codeclan_cars.vehicles.components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Dealer dealer1;
    private Dealer dealer2;
    private Customer customer;
    private Car car;
    private HybridCar hybridCar;
    private ElectricCar electricCar;
    private Seat seat;
    private Tyre tyre;
    private PetrolEngine petrolEngine;
    private HybridEngine hybridEngine;
    private ElectricEngine electricEngine;

    @Before
    public void setUp() {
        dealership = new Dealership("Arnold Codeclan", 1000000);
        customer = new Customer("Savvy Hugh", 100000);

        dealer1 = new Dealer("Dodgy Dave");
        dealer2 = new Dealer("Sneaky Steve");
        dealership.addDealer(dealer1);

        petrolEngine = new PetrolEngine();
        hybridEngine = new HybridEngine();
        electricEngine = new ElectricEngine();
        seat = new Seat();
        tyre = new Tyre();
        car = new Car(25000, "Red", petrolEngine, tyre, seat);
        hybridCar = new HybridCar(30000, "Green", hybridEngine, tyre, seat);
        electricCar = new ElectricCar(35000, "Yellow", electricEngine, tyre, seat);
        dealership.addStock(car);
        dealership.addStock(hybridCar);
        dealership.addStock(electricCar);

    }

    @Test
    public void hasName() {
        assertEquals("Arnold Codeclan", dealership.getName());
    }

    @Test
    public void hasStartingBalance() {
        assertEquals(910000, dealership.getBalance(), 0.0);
    }

    @Test
    public void canAddDealer() {
        dealership.addDealer(dealer2);
        assertEquals(2, dealership.getDealers().size());
    }

    @Test
    public void canAddStock() {
        dealership.addStock(car);
        assertEquals(4, dealership.countStock());
    }

    @Test
    public void canRemoveStock() {
        dealership.removeStock(car);
        assertEquals(2, dealership.countStock());
    }

    @Test
    public void canSellCar() {
        dealership.sellsCar(car, customer, dealer1);
        assertEquals(2, dealership.countStock());
        assertEquals(933750, dealership.getBalance(),0.0);
        assertEquals(1, customer.getCars().size());
        assertEquals(75000, customer.getWallet(), 0.0);
        assertEquals(1250, dealer1.getWallet(), 0.0);
    }
}
