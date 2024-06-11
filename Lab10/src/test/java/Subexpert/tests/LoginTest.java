package Subexpert.tests;


import Subexpert.contexts.LoggedInContext;
import Subexpert.pages.HomePage;
import org.testng.annotations.Test;
import Subexpert.utils.TestUtil;

public class LoginTest extends LoggedInContext {

    @Test
    public void testLogin() {
        String username = "testuser";
        String password = "testpassword";
        login(username, password);

        HomePage homePage = new HomePage(driver);
        String welcomeMessage = homePage.getWelcomeMessage();
        TestUtil.verifyText(welcomeMessage, "Welcome, testuser!");
    }
}
