package facebookTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailElement;

    @FindBy(id = "pass")
    WebElement passwordElement;

    @FindBy(id = "u_0_b")
    WebElement loginButtonElement;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signIn(String userName, String password) {
        emailElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }
}
