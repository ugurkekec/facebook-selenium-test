package facebookTest.test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class FacebookBaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        setProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void setDown() {
        driver.quit();
    }

    public static void setProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    public void navigateUrl(String url) {
        driver.get(url);
    }
}

