package praktikum;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    // Создадим 3 мока - для булки, ингредиента и его типа:
    @Mock
    private Bun testBun;
    @Mock
    private Ingredient testIngredient;
    @Mock
    private IngredientType testType;

    @Test
    public void testBurger () {
        // Создадим бургер из компонентов-моков:
        Burger testBurger = new Burger();
        testBurger.setBuns(testBun);
        testBurger.addIngredient(testIngredient);
        testBurger.addIngredient(testIngredient);
        testBurger.moveIngredient(0, 1);
        testBurger.addIngredient(testIngredient);
        testBurger.removeIngredient(2);
        // Стабы всех необходимых значений для методов компонентов:
        Mockito.when(testBun.getName()).thenReturn("test bun");
        Mockito.when(testBun.getPrice()).thenReturn(10.0F);
        Mockito.when(testIngredient.getName()).thenReturn("test ingredient");
        Mockito.when(testIngredient.getType()).thenReturn(testType);
        Mockito.when(testIngredient.getPrice()).thenReturn(10.0F);
        // Сравним получившийся из моков-стабов тестовый бургер с ожидаемым:
        Assert.assertEquals("(==== test bun ====)\r\n= testtype test ingredient =\r\n= testtype test ingredient =\r\n(==== test bun ====)\r\n\r\nPrice: 40,000000\r\n", testBurger.getReceipt());
    }

}
