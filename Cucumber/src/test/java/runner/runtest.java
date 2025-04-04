package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src//test//resource"},
				glue= {"stepdef"},
				plugin= {"pretty","html:target/htmlreports/report.html"}
				)

public class runtest extends AbstractTestNGCucumberTests {
	
	
	
	
	

}
