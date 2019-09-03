package Steps;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/mea/AndroidStudioProjects/Passenger_1/src/resources/functionalTest",format = {"pretty","html:target/Destination"},glue = {"Steps"},tags = {"@Login"})

public class TestRunner {

}
