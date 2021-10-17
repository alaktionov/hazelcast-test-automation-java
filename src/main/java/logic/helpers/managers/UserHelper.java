package logic.helpers.managers;

import io.qameta.allure.Step;
import logic.helpers.interfaces.UserHelperI;
import logic.models.User;

public class UserHelper extends DriverBasedHelper implements UserHelperI {

    public UserHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    @Step("User logs in to the application")
    @Override
    public void loginAs(User user) {
        pageManager.signInPage
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword())
                .clickSignInButton();
    }
}