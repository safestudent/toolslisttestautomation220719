package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    // Here we set our URL
    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk");

    // Here we set our browser
    private static final String BROWSER = System.getProperty("browser","chrome");

    // A method/command for getting our URL
    public static String getURL(){
        return URL;
    }

    // A method/command for getting the Driver for our Browser
    public static WebDriver getBrowser(){

        // We look in the 'BROWSER' variable and then return the
        // Appropriate Driver depending on whether BROWSER is 'chrome' or 'firefox'
        switch (BROWSER){

            case "chrome":

                System.out.println("Executing on Chrome");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case "firefox":

                System.out.println("Executing on Firefox");
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            case "ie":

                System.out.println("Executing on IE");
                WebDriverManager.iedriver();
                return new InternetExplorerDriver();

            default:

                throw new IllegalArgumentException("The browser variable is undefined");

        }



    }





}
