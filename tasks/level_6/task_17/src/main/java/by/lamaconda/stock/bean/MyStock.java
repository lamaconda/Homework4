package by.lamaconda.stock.bean;

import java.util.Objects;

public class MyStock {
    String companyName;
    int currentValue;
    int minValue;
    int maxValue;

    public MyStock() {
    }

    public MyStock(String companyName, int currentValue, int minValue, int maxValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStock myStock = (MyStock) o;
        return currentValue == myStock.currentValue && minValue == myStock.minValue && maxValue == myStock.maxValue && Objects.equals(companyName, myStock.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, currentValue, minValue, maxValue);
    }

    @Override
    public String toString() {
        return "MyStock{" +
                "companyName='" + companyName + '\'' +
                ", currentValue=" + currentValue +
                ", minValue=" + minValue +
                ", maxValue=" + maxValue +
                '}';
    }
}
