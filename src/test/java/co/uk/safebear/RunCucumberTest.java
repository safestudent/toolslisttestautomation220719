package co.uk.safebear;


import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Here is where I define what test report I get
        plugin = {"json:target/cucumber-report/cucumber.json"},
        // Here is where I define what tests are run (through tags)
        tags = "not @to-do",

        glue = "co.uk.safebear.gui"

        // This will show cucumber where our feature files are (if not in the default directory)
        // features = "classpath:features"
        )
public class RunCucumberTest {
}
