package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = {"src//test//resource//Features2demo"},
				glue= {"stepdefdemo"},
				plugin= {"pretty","html:target/htmlreports/report.html"}
	//			tags="@set1"
		        )





public class rundemo extends AbstractTestNGCucumberTests{
	
	
	

}
