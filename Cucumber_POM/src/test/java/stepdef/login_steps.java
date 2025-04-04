package stepdef;

import org.testng.Assert;

import POM.login_page;
import POM.products_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utitlity1.Base_class;

public class login_steps extends Base_class {
	
	login_page lp;
	products_page pp;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	launch_chrome("https://www.saucedemo.com/");
	System.out.println("The login page is displayed");
	}
	

		@When("enter the user name")
		public void enter_the_user_name() {
		   lp=new login_page(dr);
		   lp.enter_name("standard_user");
		   
		   
		}
		@When("enter the password")
		public void enter_the_password() {
		    lp.enter_pwd("secret_sauce");
		}
		
		@When("click the login button")
		public void click_the_login_button() {
		    lp.click_login();
		}
		@Then("product page will display")
		public void product_page_will_display() {
		   System.out.println("Products");
		   pp=new products_page(dr);
		 String title =pp.get_title();
		   Assert.assertEquals("Products",title);
		}

}
