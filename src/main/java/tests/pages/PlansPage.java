package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PlansPage extends Page {

    @FindBy(xpath = "//button//span[contains(text(),'CREATE CLUSTER')][1]")
    private WebElement createClusterButton;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateClusterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createClusterButton)).click();
    }
}
