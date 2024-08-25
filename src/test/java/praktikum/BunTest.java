package praktikum;

import org.junit.Test;
import org.junit.Assert;

public class BunTest {

    Bun testBun = new Bun("test bun", 10);

    @Test
    public void testGetNameBun() {
        Assert.assertEquals("test bun", testBun.getName());
    }

    @Test
    public void testGetPriceBun() {
        Assert.assertEquals(10, testBun.getPrice(), 0);
    }

}
