package hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverFactory.DriverFactory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class MyHooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		Properties prop = ConfigReader.intializeProperties();
		driver = DriverFactory.initializaBrowser(prop.getProperty("browser"));
		
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void teardown(Scenario scenario)
	{
		String scenarioName = scenario.getName().replace(" ", "_");
		if (scenario.isFailed()) {
			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		
		driver.quit();
		
	}

}
