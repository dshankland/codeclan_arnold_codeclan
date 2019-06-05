import codeclan_cars.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;

    @Before
    public void setUp() throws Exception {
        till = new Till(1000000);
    }

    @Test
    public void startWithLoads() {
        assertEquals(1000000, till.getBalance(), 0.0);
    }

    @Test
    public void canAddMoney() {
        till.addMoney(1000);
        assertEquals(1001000, till.getBalance(), 0.0);
    }

    @Test
    public void canRemoveMoney() {
        till.removeMoney(1000);
        assertEquals(999000, till.getBalance(), 0.0);
    }
}
