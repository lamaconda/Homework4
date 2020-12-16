package by.lamaconda.stock.service;

import by.lamaconda.stock.bean.MyStock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MyStockServiceTest {

    MyStockService myStockService;

    Logger logger = LoggerFactory.getLogger(MyStockServiceTest.class);

    @Before
    public void setUp() {
        logger.info("setUp runs");

    }

    @Test
    public void updateValue_case1() {
        logger.info("updateValue_case1");
        MyStock myStockMock = new MyStock("Integrator", 0, 0, 0);
        myStockService = new MyStockService(myStockMock);

        MyStock myStockExpected = new MyStock("Integrator", 5, 0, 5);

        MyStock myStockActual = myStockService.updateValue(5);

        assertEquals(myStockExpected, myStockActual);
    }

    @Test
    public void updateValue_case2() {
        logger.info("updateValue_case2");
        MyStock myStockMock = new MyStock("Integrator", 10, 3, 12);
        myStockService = new MyStockService(myStockMock);

        MyStock myStockExpected = new MyStock("Integrator", 11, 3, 12);

        MyStock myStockActual = myStockService.updateValue(11);

        assertEquals(myStockExpected, myStockActual);
    }

    @Test
    public void getValueInfo() {
        logger.info("getValueInfo");
        MyStock myStockMock = new MyStock("Integrator", 10, 3, 12);
        myStockService = new MyStockService(myStockMock);

        String expected = "Company = Integrator, Current Price = 10, Min Price = 3, Max Price = 12";

        String actual = myStockService.getValueInfo();

        assertEquals(expected, actual);
    }
}
