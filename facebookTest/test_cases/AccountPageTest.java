package facebookTest.test_cases;

import facebookTest.collections.AccountPageCollections;
import facebookTest.pages.AccountPage;
import facebookTest.pages.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class AccountPageTest extends FacebookBaseTest {

    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @Test
    public void filledToAccountFields() {
        navigateUrl(AccountPageCollections.accountPageUrl);
        new AccountPage(driver).fillAccountFields(
                AccountPageCollections.accountName,
                AccountPageCollections.accountSurname,
                AccountPageCollections.accountEmail,
                AccountPageCollections.reEnterAccountEmail,
                AccountPageCollections.accountPassword,
                AccountPageCollections.accountDateDay,
                AccountPageCollections.accountDateMonth,
                AccountPageCollections.accountDateYear);
        logger.info(AccountPageCollections.accountSuccess);
    }
}
