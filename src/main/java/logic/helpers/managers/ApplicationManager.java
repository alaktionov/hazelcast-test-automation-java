package logic.helpers.managers;

import logic.configuration.PropertyLoader;
import logic.driver.DriverManager;
import logic.driver.DriverManagerFactory;
import logic.models.DriverType;
import logic.helpers.interfaces.ApplicationManagerI;
import logic.helpers.interfaces.ClusterHelperI;
import logic.helpers.interfaces.NavigationHelperI;
import logic.helpers.interfaces.UserHelperI;
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