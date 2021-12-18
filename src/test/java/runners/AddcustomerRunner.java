package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue ="steps",
		tags ="@ScenarioA",
		monochrome = true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:targer/cucumber",
				"json:target/cucumber.json"
		}
		
		
		)
public class AddcustomerRunner {

}
