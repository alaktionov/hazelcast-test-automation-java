package com.hazelcast.testautomation.helpers.managers;

import com.hazelcast.testautomation.configuration.PropertyLoader;
import com.hazelcast.testautomation.driver.DriverManager;
import com.hazelcast.testautomation.driver.DriverManagerFactory;
import com.hazelcast.testautomation.models.DriverType;
import com.hazelcast.testautomation.helpers.interfaces.ApplicationManagerI;
import com.hazelcast.testautomation.helpers.interfaces.ClusterHelperI;
import com.hazelcast.testautomation.helpers.interfaces.NavigationHelperI;
import com.hazelcast.testautomation.helpers.interfaces.UserHelperI;
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