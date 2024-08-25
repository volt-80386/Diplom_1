package praktikum;

import org.junit.Test;
import org.junit.Assert;

// Проверим "базу данных" не предмет ее "доступности" и работоспособности методов, сделав выборочные запросы и сравнив возвращенные значения с ожидаемыми:
public class DatabaseTest {

    Database databaseTest = new Database();

    @Test
    public void testGetAvailableBuns() {
        Assert.assertEquals("black bun", databaseTest.availableBuns().get(0).getName());
        Assert.assertEquals(100, databaseTest.availableBuns().get(0).getPrice(), 0);
    }

    @Test
    public void testGetAvailableIngredients() {
        Assert.assertEquals("hot sauce", databaseTest.availableIngredients().get(0).getName());
        Assert.assertEquals(100, databaseTest.availableIngredients().get(0).getPrice(), 0);
    }

}
