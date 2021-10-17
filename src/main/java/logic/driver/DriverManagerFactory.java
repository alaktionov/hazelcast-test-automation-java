package logic.driver;

import logic.models.DriverType;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
            case SAFARI:
            case IE:
            default:
                //TODO: implement FirefoxDriverManager, SafariDriverManager, IEDriverManager
                throw new IllegalArgumentException(String.format("Unsupported driverType: %s", type));
        }
        return driverManager;
    }
}