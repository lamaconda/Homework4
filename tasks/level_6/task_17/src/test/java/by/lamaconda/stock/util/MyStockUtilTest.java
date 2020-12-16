package by.lamaconda.stock.util;

import by.lamaconda.stock.bean.MyStock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyStockUtilTest {

    @Test
    public void shouldSetNewCurrentValue() {
        MyStock myStock = new MyStock("Integrator", 0, 0, 0);
        int expectedValue = 11;

        MyStockUtil.updateValue(myStock, 11);
        assertEquals(expectedValue, myStock.getCurrentValue());
    }

    @Test
    public void shouldSetNewCurrentValueAndMinValue() {
        MyStock myStock = new MyStock("Integrator", 10, 8, 0);
        MyStock myStockExpected = new MyStock("Integrator", 5, 5, 0);

        MyStockUtil.updateValue(myStock, 5);

        assertEquals(myStockExpected, myStock);
    }

    @Test
    public void shouldSetNewCurrentValueAndMaxValue() {
        MyStock myStock = new MyStock("Integrator", 10, 8, 0);
        MyStock myStockExpected = new MyStock("Integrator", 15, 8, 15);

        MyStockUtil.updateValue(myStock, 15);

        assertEquals(myStockExpected, myStock);
    }

    @Test
    public void shouldSetAllValues() {
        MyStock myStock = new MyStock("Integrator", 0, 0, 0);
        MyStock myStockExpected = new MyStock("Integrator", 15, 15, 15);

        MyStockUtil.updateValue(myStock, 15);

        assertEquals(myStockExpected, myStock);
    }
}
