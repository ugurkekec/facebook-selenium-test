package facebookTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstname")
    WebElement nameElement;

    @FindBy(name = "lastname")
    WebElement lastNameElement;

    @FindBy(xpath = "//*[@id=\"u_0_r\"]")
    WebElement emailOrNumberElement;

    @FindBy(xpath = "//*[@id=\"u_0_u\"]")
    WebElement reEmailElement;

    @FindBy(name = "reg_passwd__")
    WebElement newPasswordElement;

    @FindBy(id = "day")
    WebElement dayElement;

    @FindBy(id = "month")
    WebElement monthElement;

    @FindBy(id = "year")
    WebElement yearElement;

    @FindBy(id = "u_0_7")
    WebElement genderElement;

    @FindBy(id = "websubmit")
    WebElement webSubmitElement;

    public void fillAccountFields(String newName, String newLastName, String newEmail, String reEmail, String newPassword,
                                  String newDay, String newMonth, String newYear) {
        nameElement.sendKeys(newName);
        lastNameElement.sendKeys(newLastName);
        emailOrNumberElement.sendKeys(newEmail);
        newPasswordElement.sendKeys(newPassword);
        reEmailElement.sendKeys(reEmail);
        dayElement.sendKeys(newDay);
        monthElement.sendKeys(newMonth);
        yearElement.sendKeys(newYear);
        genderElement.click();
        webSubmitElement.click();
    }
}
