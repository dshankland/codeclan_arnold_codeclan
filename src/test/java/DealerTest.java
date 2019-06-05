import codeclan_cars.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setUp() {
        dealer = new Dealer("Dodgy Dave");
    }

    @Test
    public void hasName() {
        assertEquals("Dodgy Dave", dealer.getName());
    }
}
