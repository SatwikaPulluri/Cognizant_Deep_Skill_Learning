// File: Main.java

public class Main {
    public static void main(String[] args) {
        StockMarket tcsStock = new StockMarket("TCS", 3400.00);

        Observer mobileUser = new MobileApp("Satwika");
        Observer webUser = new WebApp("Sowmya");

        // Register observers
        tcsStock.registerObserver(mobileUser);
        tcsStock.registerObserver(webUser);

        // Simulate price changes
        tcsStock.setStockPrice(3425.50);
        tcsStock.setStockPrice(3450.75);

        // Unregister one observer
        tcsStock.removeObserver(webUser);

        // More changes after removal
        tcsStock.setStockPrice(3470.00);
    }
}
