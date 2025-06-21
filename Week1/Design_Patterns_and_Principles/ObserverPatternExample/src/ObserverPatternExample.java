// File: ObserverPatternExample.java

import java.util.*;

// Step 2: Subject Interface
interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Step 3: Concrete Subject
class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.stockPrice = initialPrice;
    }

    public void setStockPrice(double newPrice) {
        System.out.println("\nStock price of " + stockName + " updated to ₹" + newPrice);
        this.stockPrice = newPrice;
        notifyObservers();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }
}

// Step 4: Observer Interface
interface Observer {
    void update(String stockName, double stockPrice);
}

// Step 5: Concrete Observers
class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double stockPrice) {
        System.out.println("[" + user + "'s MobileApp] " + stockName + " is now ₹" + stockPrice);
    }
}

class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    public void update(String stockName, double stockPrice) {
        System.out.println("[" + user + "'s WebApp] " + stockName + " is now ₹" + stockPrice);
    }
}
