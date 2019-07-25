package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

    LoginPageLocators locators = new LoginPageLocators();

    @NonNull
    WebDriver driver;

    public String getTheTitleOfThePage(){

        return driver.getTitle();

    }

    public void clickSubmitButton(){

        driver.findElement(locators.getSubmitButton()).click();

    }

    public void typeIntoPasswordField(String password){

        driver.findElement(locators.getPasswordField()).sendKeys(password);

    }

    public void typeIntoUsernameField(String username){

        driver.findElement(locators.getUsernameField()).sendKeys(username);

    }

}
