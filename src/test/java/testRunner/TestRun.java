package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features ="classpath:Features/SearchIBM.feature",
		glue ="stepDefinitions",
		dryRun =false ,
		monochrome=	true,
		plugin ={"pretty","html:report-folder"}
)

public class TestRun {
	
	

}
