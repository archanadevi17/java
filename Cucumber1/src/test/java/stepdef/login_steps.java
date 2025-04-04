package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps  extends utitlity1.common_methods{
	
	
	@Given("login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		
		launch_chrome("https://www.saucedemo.com/");
		System.out.println("The login page is displayed");
		
			}
			
		@When("^user enters the valid user name$")
		public void user_enters_the_valid_user_name() {
	
			// Write code here that turns the phrase above into concrete action
			dr.findElement(By.id("user-name")).sendKeys("standard_user");
		}
		@When("^user enters the valid password$")
		public void user_enters_the_valid_password() {
		 
			// Write code here that turns the phrase above into concrete actions
			dr.findElement(By.id("password")).sendKeys("secret_sauce");
		}
		
		@When("^user clicks the login button$")
		public void user_clicks_the_login_button1() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("login-button")).click();
	}

		

		@Then("^login has been done successfully$")
		public void login_has_been_done_successfully() {
		    // Write code here that turns the phrase above into concrete actions
			
			String s=dr.findElement(By.xpath("//span[@class='title']")).getText();
			Assert.assertEquals("Products", s);
		}
}
		
		
//------------------------------------------------------------------------------------------------------------------





