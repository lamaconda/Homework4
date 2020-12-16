package by.lamaconda.stock.service;

import by.lamaconda.stock.bean.MyStock;

public class MyStockService {

    MyStock myStock;

    public MyStock getMyStock() {
        return myStock;
    }

    public MyStockService(MyStock myStock) {
        this.myStock = myStock;
    }

    public MyStock updateValue(int newValue) {
        myStock.setCurrentValue(newValue);
        if (myStock.getMinValue() > newValue) {
            myStock.setMinValue(newValue);
        } else if (myStock.getMaxValue() < newValue) {
            myStock.setMaxValue(newValue);
        }
        return myStock;
    }

    public String getValueInfo() {
        String info = "Company = " +
                myStock.getCompanyName() +
                ", Current Price = "
                + myStock.getCurrentValue() +
                ", Min Price = " + myStock.getMinValue() +
                ", Max Price = " + myStock.getMaxValue();
        return info;
    }
}
