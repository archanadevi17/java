
package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps2 extends utitlity1.common_methods {
	
	@Given("The login page is displayed")
	public void the_login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions

		launch_chrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed");
		
	}
	@When("User enters username and password")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("login-button")).click();
	}
	@Then("The application should display the message\"Epic sadface:Username and password do not match any user in this service\"")
	public void the_application_should_display_the_message_epic_sadface_username_and_password_do_not_match_any_user_in_this_service() {
	    // Write code here that turns the phrase above into concrete actions
		String s=dr.findElement(By.xpath("//h3[@data-test='error']")).getText();
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", s);
	}
   
}


