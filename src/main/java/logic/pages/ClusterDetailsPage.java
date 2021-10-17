package logic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClusterDetailsPage extends Page {

    @FindBy(xpath = "//span[@mode='primary']")
    private WebElement clusterStatusField;

    @FindBy(xpath = "//button//span[contains(text(),'MANAGE CLUSTER')]")
    private WebElement manageClusterButton;

    @FindBy(xpath = "//button//span[contains(text(),'DELETE')]")
    private WebElement deleteClusterButton;

    public ClusterDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getClusterStatus() {
        return wait.until(ExpectedConditions.visibilityOf(clusterStatusField)).getText();
    }

    public void clickDeleteClusterAndConfirm() {
        wait.until(ExpectedConditions.elementToBeClickable(manageClusterButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(deleteClusterButton)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }
}