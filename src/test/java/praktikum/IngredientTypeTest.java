package praktikum;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final String ingredientStringType;
    private final String name;

    public IngredientTypeTest(String ingredientStringType, String name) {
        this.ingredientStringType = ingredientStringType;
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] getIngredientData() {
        return new Object[][]{
                {"SAUCE", "test sauce"},
                {"FILLING", "test filling"},
        };
    }

    @Test
    public void testIngredientType() {
        Ingredient testIngredient = new Ingredient(IngredientType.valueOf(ingredientStringType), name, 0);
        Assert.assertEquals(IngredientType.valueOf(ingredientStringType), testIngredient.getType());
    }

}
