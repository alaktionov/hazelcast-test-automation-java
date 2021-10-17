package tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmationPage extends Page {

    @FindBy(xpath = "//button//span[contains(text(),'CONTINUE CREATING CLUSTER')]")
    private WebElement continueCreatingClusterButton;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueCreatingClusterButton() {
        wait.until(ExpectedConditions.visibilityOf(continueCreatingClusterButton)).click();
    }
}