package praktikum;

import org.junit.Test;
import org.junit.Assert;

public class BunTest {

    Bun testBun = new Bun("test bun", 10);

    @Test
    public void testGetNameBun() {
        String actualBunName = testBun.getName();
        Assert.assertEquals("test bun", actualBunName);
    }

    @Test
    public void testGetPriceBun() {
        int actualBunPrice = (int) testBun.getPrice();
        Assert.assertEquals(10, actualBunPrice, 0);
    }

}
