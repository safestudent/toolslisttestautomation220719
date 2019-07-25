package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class ToolPage {

    @NonNull
    WebDriver driver;

    ToolsPageLocators locators = new ToolsPageLocators();

    public String getTitleOfPage(){

        return driver.getTitle();

    }

    public String getLoginSuccessfulMessage(){

        return driver.findElement(locators.getSuccessfulLoginMessage()).getText();

    }


    public String getNameOfTool(){

        return driver.findElement(locators.getTestCafeToolLocator()).getText();

    }

    public void clickOnSearchButton(){

        driver.findElement(locators.getSearchButtonLocator()).click();

    }

    public void typeInSearchField(String toolName){
        driver.findElement(locators.getSearchFieldLocator()).sendKeys(toolName);
    }








}
