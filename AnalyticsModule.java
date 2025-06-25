package analytics;

public class AnalyticsModule {
    private static AnalyticsModule instance;

    private AnalyticsModule() {
        // private constructor
    }

    public static AnalyticsModule getInstance() {
        if (instance == null) {
            instance = new AnalyticsModule();
        }
        return instance;
    }

    public void analyze() {
        System.out.println("Analyzing data...");
    }
}
