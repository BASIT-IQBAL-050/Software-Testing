package Subexpert.contexts;


import Subexpert.base.TestBase;
import Subexpert.pages.LoginPage;

public class LoggedInContext extends TestBase {
    protected void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
}
