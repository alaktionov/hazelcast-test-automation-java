package com.hazelcast.testautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Page {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SignInPage enterEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public SignInPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}