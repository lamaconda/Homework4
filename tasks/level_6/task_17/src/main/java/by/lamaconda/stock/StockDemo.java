package by.lamaconda.stock;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Remi", 372);

        stock.updateValue(89);
        System.out.println(stock.getValueInfo());
        stock.updateValue(451);
        System.out.println(stock.getValueInfo());
        stock.updateValue(253);
        System.out.println(stock.getValueInfo());
    }
}
