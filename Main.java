import analytics.AnalyticsModule;
import observer.*;
import product.Product;

public class Main {
    public static void main(String[] args) {
        // Singleton
        AnalyticsModule analytics = AnalyticsModule.getInstance();
        analytics.analyze();

        // Observer pattern
        EcommercePlatform platform = new EcommercePlatform() {};
        Client c1 = new Client("Alice");
        Client c2 = new Client("Bob");

        platform.addObserver(c1);
        platform.addObserver(c2);

        platform.notifyObservers("New product launched!");
    }
}
