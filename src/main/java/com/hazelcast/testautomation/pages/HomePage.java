package com.hazelcast.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Page {

    @FindBy(xpath = "//span[contains(text(),'NEW CLUSTER')]")
    private WebElement newClusterButton;

    @FindBy(xpath = "//a//span[contains(text(),'Free Cluster')]")
    private WebElement freeCluster;

    @FindBy(xpath = "//p[contains(text(),'You have no ')][2]")
    private WebElement emptySharedClustersList;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickNewClusterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(newClusterButton)).click();
    }

    public void clickOnFreeCluster() {
        wait.until(ExpectedConditions.elementToBeClickable(freeCluster)).click();
    }

    public boolean isSharedClustersListEmpty() {
        return wait.until(ExpectedConditions.visibilityOf(emptySharedClustersList)).isDisplayed();
    }
}
