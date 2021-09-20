package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature/login.feature", glue= {"stepDefinition"}, tags={"@invalid"})
//@CucumberOptions(features="Feature/datatable.feature", glue= {"stepDefinition"})
//@CucumberOptions(features="Feature/scenariooutline.feature", glue= {"stepDefinition"})
//@CucumberOptions(features="Feature/backgrounddemo.feature", glue= {"stepDefinition"})
//@CucumberOptions(features="Feature", glue= {"stepDefinition"}, tags= {"@smoke"}, plugin= {"pretty", "html:target/cucumberhtmlreport"},monochrome=true)
//@CucumberOptions(features="Feature", glue= {"stepDefinition"}, tags= {"@smoke"}, plugin= {"pretty", "json:jsonreport/cucumberjsonreport"},monochrome=true)
@CucumberOptions(features="Feature", glue= {"stepDefinition"}, tags= {"@smoke"}, plugin= {"pretty", "junit:xmljunitreport/cucumberxmljunitreport/report.xml"},monochrome=true)

//@CucumberOptions(features="Feature", glue= {"stepDefinition"}, tags= {"@smoke"}, plugin= {"usage"},monochrome=true)


public class TestRunner {
	

}
