package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\\\main\\\\java\\\\Features\\\\Amazon.feature",
		// "C:\\Users\\DELL\\eclipse-workspace\\BDDCucumber\\src\\main\\java\\Features", //the path of the feature files
		glue={"StepDefinitions"},//the path of the step definition files
		//dryRun=false,
		//monochrome = true,
		plugin= {"pretty","html:test-outout","json:report_json/report.json","junit:report_xml/report.xml"}	
		)

public class TestRunnerClass {

}
