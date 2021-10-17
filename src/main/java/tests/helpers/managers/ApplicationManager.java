package tests.helpers.managers;

import tests.configuration.PropertyLoader;
import tests.driver.DriverManager;
import tests.driver.DriverManagerFactory;
import tests.models.DriverType;
import tests.helpers.interfaces.ApplicationManagerI;
import tests.helpers.interfaces.ClusterHelperI;
import tests.helpers.interfaces.NavigationHelperI;
import tests.helpers.interfaces.UserHelperI;
import org.openqa.selenium.WebDriver;

public class ApplicationManager implements ApplicationManagerI {

    private final NavigationHelperI navHelper;
    private final UserHelperI userHelper;
    private final ClusterHelperI clusterHelper;

    private final DriverManager driverManager;
    private final WebDriver driver;
    private final String baseUrl;


    public ApplicationManager() {
        baseUrl = PropertyLoader.loadProperty("site.url");
        String browser = PropertyLoader.loadProperty("browser.name");

        // For now only chromedriver is supported
        // TODO: Add support for other drivers (ie, safari, firefox)
        driverManager = DriverManagerFactory.getManager(DriverType.getDriverType(browser));
        driver = driverManager.getDriver();

        navHelper = new NavigationHelper(this);
        userHelper = new UserHelper(this);
        clusterHelper = new ClusterHelper(this);

        getNavigationHelper().openMainPage();
    }

    @Override
    public NavigationHelperI getNavigationHelper() {
        return navHelper;
    }

    @Override
    public UserHelperI getUserHelper() {
        return userHelper;
    }

    @Override
    public ClusterHelperI getClusterHelper() {
        return clusterHelper;
    }

    @Override
    public void stop() {
        driverManager.quitDriver();
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    protected String getBaseUrl() {
        return baseUrl;
    }
}