package runnerpack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/flipcartdemo.feature", glue ="stepdefpack")
public class flipcartRunner {

}
