package com.hazelcast.testautomation.helpers.managers;

import com.hazelcast.testautomation.helpers.interfaces.NavigationHelperI;

public class NavigationHelper extends DriverBasedHelper implements NavigationHelperI {

    private final String baseURL;

    public NavigationHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseURL = manager.getBaseUrl();
    }

    @Override
    public void openMainPage() {
        driver.get(baseURL);
    }

    @Override
    public void openRelativeUrl(String url) {
        driver.get(baseURL + url);
    }
}