package runnerpack;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.io.*;
import managers.FileReaderManager;


@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/datatabledemo.feature", glue="stepdefpack", 
plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reportss/reports.html"})
public class RunnerWHeader {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}
