package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src//test//resource//Features"},
			glue= {"stepdef3"},
			plugin= {"pretty","html:target/htmlreports/report.html"}
//			tags="@set1"
			)


public class test3 extends AbstractTestNGCucumberTests {
	

}
