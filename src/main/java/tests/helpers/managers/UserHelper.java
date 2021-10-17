package tests.helpers.managers;

import tests.helpers.interfaces.UserHelperI;
import tests.models.User;

public class UserHelper extends DriverBasedHelper implements UserHelperI {

    public UserHelper(ApplicationManager manager) {
        super(manager.getWebDriver());
    }

    @Override
    public void loginAs(User user) {
        pageManager.signInPage
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword())
                .clickSignInButton();
    }
}