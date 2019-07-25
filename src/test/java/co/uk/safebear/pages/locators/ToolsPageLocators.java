package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    // Message
    private By successfulLoginMessage = By.xpath(".//b[.='Login Successful']");

    // Search Field

    private By searchFieldLocator = By.id("toolName");

    // Search Button

    private By searchButtonLocator = By.xpath(".//button[@class='btn btn-info' and @type ='submit']");

    // The title of the tool

    private By testCafeToolLocator = By.xpath(".//td[.='TestCafe']");

}
