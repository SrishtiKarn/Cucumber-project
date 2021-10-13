package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature1"
		,glue={"stepdefination","hooks"},
		//dryRun = false,
		monochrome = true,
		//tags={"@timeline"},
				plugin={"pretty","junit:target/report.xml","html:target/cucumber-pretty","json:target/jsonreport.json"}
		//tags={"~@smoke"},
		//tags={"@smoke,@regression"},
		
		)


public class testrunner {

}