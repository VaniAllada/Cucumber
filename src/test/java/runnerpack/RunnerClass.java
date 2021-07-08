package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Opengoogl.feature", glue="stepdefpack")
public class RunnerClass {
	

}
