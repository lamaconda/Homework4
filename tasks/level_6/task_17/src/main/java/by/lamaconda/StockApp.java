package by.lamaconda;

import by.lamaconda.stock.bean.MyStock;
import by.lamaconda.stock.util.MyStockUtil;

public class StockApp {
    public static void main(String[] args) {
        MyStock myStock = new MyStock("Integrator", 0, 0, 0);
        MyStockUtil.updateValue(myStock, 14);
    }
}
