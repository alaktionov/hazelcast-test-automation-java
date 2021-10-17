package com.hazelcast.testautomation.helpers.managers;

import com.hazelcast.testautomation.pages.ClusterDetailsPage;
import com.hazelcast.testautomation.pages.ConfirmationPage;
import com.hazelcast.testautomation.pages.CreateClusterPage;
import com.hazelcast.testautomation.pages.HomePage;
import com.hazelcast.testautomation.pages.PlansPage;
import com.hazelcast.testautomation.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageManager {

    private final WebDriver driver;
    public SignInPage signInPage;
    public HomePage homePage;
    public PlansPage plansPage;
    public CreateClusterPage createClusterPage;
    public ConfirmationPage confirmationPage;
    public ClusterDetailsPage clusterDetailsPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        plansPage = PageFactory.initElements(driver, PlansPage.class);
        createClusterPage = PageFactory.initElements(driver, CreateClusterPage.class);
        confirmationPage = PageFactory.initElements(driver, ConfirmationPage.class);
        clusterDetailsPage = PageFactory.initElements(driver, ClusterDetailsPage.class);
    }

    public WebDriver getWebDriver() {
        return driver;
    }
}