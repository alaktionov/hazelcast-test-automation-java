package logic.helpers.managers;

import logic.helpers.interfaces.UserHelperI;
import logic.models.User;

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