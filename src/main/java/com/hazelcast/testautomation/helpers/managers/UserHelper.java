package com.hazelcast.testautomation.helpers.managers;

import com.hazelcast.testautomation.helpers.interfaces.UserHelperI;
import com.hazelcast.testautomation.models.User;

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