package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/datatabledemo.feature", glue="stepdefpack", monochrome=true,
plugin= {"pretty","junit:target/MyReports/report.xml","html:target/cucumber-html-report",
        "json:target/MyReports/report.json",})
public class RCExamples {

}
