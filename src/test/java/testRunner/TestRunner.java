package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@ RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"},//specifies where the feature file store
		glue = {"steps","hooks"},// specifies where the steps are stored
		publish= true,
		plugin = {"pretty","html:target/CucumberReport/CucumberReport.html"}// specifies the what kind of report to generate HTML, Json,Junit
		//tags =  "@all and not @dev and not @wip and not @ignore"
		// = true,// it is used to specify if the step definition has the steps or not
		// strict = true it means it is compulsory to have all the step definition but now it is decrepicated.I have only the impact i Junit report 
		//monochrome = true
		//tags = "@smoke"
		//name = {"Logo"}
		)
class TestRunner {
	

}
