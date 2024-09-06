package praktikum;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getIngredientData() {
        return new Object[][]{
                {SAUCE, "test sauce", 10},
                {FILLING, "test filling", 20},
        };
    }

    @Test
    public void testIngredient() {
        Ingredient testIngredient = new Ingredient(type, name, price);
        Assert.assertEquals(name, testIngredient.getName());
        Assert.assertEquals(type, testIngredient.getType());
        Assert.assertEquals(price, testIngredient.getPrice(), 0);
    }

}
