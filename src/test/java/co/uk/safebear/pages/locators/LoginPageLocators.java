package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // Fields

    private By usernameField = By.id("username");
    private By passwordField = By.name("psw");

    // Buttons
    private By submitButton = By.id("enter");


    // Messages

    private By failedLoginMessage = By.xpath(".//p[@id='rejectLogin']/b");


}
