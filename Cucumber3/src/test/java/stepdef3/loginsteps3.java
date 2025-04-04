package stepdef3;

import Utility3.ScenarioContext;
import Utility3.textContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps3 {
	textContext tContext;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {

		//launch_chrome("https://www.saucedemo.com");
		System.out.println("The login page is displayed");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String uid, String pwd) {
	   System.out.println("User enters valid username and password");
	tContext =new textContext();
	tContext.set(ScenarioContext.USERNAME.toString(),uid);
	tContext.set(ScenarioContext.SESSION_TOKEN.toString(),"asd789");   
	}

	@Then("User Session should be available")
	public void user_session_should_be_available() {
	    
		String storeduid=(String)tContext.get(ScenarioContext.USERNAME.toString());
		String sessionToken=(String)tContext.get(ScenarioContext.SESSION_TOKEN.toString());
		System.out.println("storeduid:"+storeduid + "\n sessionToken: " +sessionToken );
	}

}
