import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/java"),tags="",
        plugin = {"pretty","json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class TestRunner {
}