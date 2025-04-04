package stepdef;

import io.cucumber.java.en.Given;

public class login_steps  extends utility1.common_methods1{
	
	
	@Given("login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		
		launch_chrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed");
	   
	}


}
