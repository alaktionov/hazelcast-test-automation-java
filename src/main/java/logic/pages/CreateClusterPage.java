package logic.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateClusterPage extends Page {

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement createFreeClusterButton;

    public CreateClusterPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateFreeClusterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createFreeClusterButton)).click();
    }
}