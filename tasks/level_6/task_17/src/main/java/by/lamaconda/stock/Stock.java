package by.lamaconda.stock;

import java.util.Objects;

class Stock {
    String companyName;
    int currentValue;
    int minValue;
    int maxValue;

    public Stock(String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = currentValue;
        this.maxValue = currentValue;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCurrentValue() {

        return currentValue;
    }

    public void setCurrentValue(int currentValue) {

        this.currentValue = currentValue;
    }

    public double getMinValue() {
        return minValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return currentValue == stock.currentValue && minValue == stock.minValue && maxValue == stock.maxValue && Objects.equals(companyName, stock.companyName);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyName='" + companyName + '\'' +
                ", currentValue=" + currentValue +
                ", minValue=" + minValue +
                ", maxValue=" + maxValue +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, currentValue, minValue, maxValue);
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }


    public void updateValue(int newValue) {
        setCurrentValue(newValue);
        if (getMinValue() > newValue) {
            setMinValue(newValue);
        } else if (getMaxValue() < newValue) {
            setMaxValue(newValue);
        }
    }

    public String getValueInfo() {
        String info = "Company = " + getCompanyName() + ", Current Price = " + getCurrentValue() + ", Min Price = " + getMinValue() + ", Max Price = " + getMaxValue();
        return info;
    }
}



