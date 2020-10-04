package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src/test/resources/Signup_EmailValidation/Signup_EmailValidation.feature"},
//features = {"C:\\Workspace\\pom\\src\\test\\resources\\Signup_EmailValidation\\Signup_EmailValidation.feature"	
    glue={"StepDefinition"},
	tags="@Signup",
	dryRun=false,//To check weather you have missed an steps in the scenario
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check whether any step is not defined in step definition
	plugin = {"html:testoutput.html","junit:junit_xml/cucumber.xml","json:json_output/cucumnber.json"}
	)

public class runner {

}
