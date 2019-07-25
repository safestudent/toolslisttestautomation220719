package co.uk.safebear;

import co.uk.safebear.pages.Dog;
import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver browser;
    LoginPage loginPage;
    ToolPage toolPage;



    @Before
    public void setUp(){

        browser = Driver.getDriver();
        browser.get(Driver.getUrl());
        loginPage = new LoginPage(browser);
        toolPage = new ToolPage(browser);


    }

    @After
    public void tearDown(){

        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        browser.quit();
    }


    @Given("I am logged out")
    public void i_am_logged_out() {

        assertEquals("We're not on the Login Page","Login Page", loginPage.getTheTitleOfThePage());


    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {

        loginPage.typeIntoUsernameField(username);
        loginPage.typeIntoPasswordField(password);
        loginPage.clickSubmitButton();

    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {

        assertEquals("You're not on the Login Page, the Login failed, username or password is probably incorrect", "Tools Page", toolPage.getTitleOfPage());

        assertEquals("Login Successful", toolPage.getLoginSuccessfulMessage());

    }

}
