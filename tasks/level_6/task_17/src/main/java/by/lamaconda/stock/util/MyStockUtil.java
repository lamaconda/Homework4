package by.lamaconda.stock.util;

import by.lamaconda.stock.bean.MyStock;

public class MyStockUtil {

    private MyStockUtil() {
    }

    public static void updateValue(MyStock myStock, int newValue) {
        if (isFirstUpdate(myStock)) {
            myStock.setMinValue(newValue);
            myStock.setMaxValue(newValue);
        }
        else if (isNewMinValue(myStock, newValue)) {
            myStock.setMinValue(newValue);
        }
        else if (isNewMaxValue(myStock, newValue)) {
            myStock.setMaxValue(newValue);
        }

        myStock.setCurrentValue(newValue);
    }

    private static boolean isFirstUpdate(MyStock myStock) {
        return myStock.getCurrentValue() == 0
                && myStock.getMaxValue() == 0
                && myStock.getMinValue() == 0;
    }

    private static boolean isNewMinValue(MyStock myStock, int newValue) {
        return myStock.getMinValue() > newValue;
    }

    private static boolean isNewMaxValue(MyStock myStock, int newValue) {
        return myStock.getMinValue() < newValue;
    }

//    public static String getValueInfo(MyStock myStock) {
//        String info = "Company = " +
//                myStock.getCompanyName() +
//                ", Current Price = "
//                + myStock.getCurrentValue() +
//                ", Min Price = " + myStock.getMinValue() +
//                ", Max Price = " + myStock.getMaxValue();
//        return info;
//    }
}
