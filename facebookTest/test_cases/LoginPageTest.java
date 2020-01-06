package facebookTest.test_cases;

import facebookTest.collections.LoginPageCollections;
import facebookTest.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends FacebookBaseTest {

    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @Test
    public void correctLogin() {
        navigateUrl(LoginPageCollections.loginPageUrl);
        new LoginPage(driver).signIn(LoginPageCollections.correctLoginName, LoginPageCollections.correctLoginPassword);
        logger.info(LoginPageCollections.successResponse);
    }

    @Test
    public void incorrectLogin() {
        navigateUrl(LoginPageCollections.loginPageUrl);
        new LoginPage(driver).signIn(LoginPageCollections.incorrectLoginName, LoginPageCollections.incorrectLoginPassword);
        logger.info(LoginPageCollections.failedResponse);
    }

    @Test
    public void nullLogin() {
        navigateUrl(LoginPageCollections.loginPageUrl);
        new LoginPage(driver).signIn(LoginPageCollections.nullLoginName, LoginPageCollections.nullLoginPassword);
        logger.info(LoginPageCollections.fieldEmptyMessage);
    }
}
