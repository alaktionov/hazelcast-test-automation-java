package tests.helpers.managers;

import tests.pages.ClusterDetailsPage;
import tests.pages.ConfirmationPage;
import tests.pages.CreateClusterPage;
import tests.pages.HomePage;
import tests.pages.PlansPage;
import tests.pages.SignInPage;
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