package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.BaseClass;

import helper.FileReaderManager;
import hooks.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import properties.ConfigReader;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Feature",
				glue = {"stepDefinition", "hooks"},
//				dryRun = true,
				monochrome = true,
				tags = "@SmokeTest",
// 				plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				plugin = {"json:target/cucumber.json"}
		)

public class AdactinRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {

		String browser = FileReaderManager.getFrmInstance().getCrInstance().getBrowser();
		driver = BaseClass.launch(browser);
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.driverQuit();
	}

}
