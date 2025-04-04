package stepdefdemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_demo1 extends utitlity1.common_methods {
	@Given("login page is displayed")
	public static void login_page_is_displayed() {

		launch_chrome("https://demowebshop.tricentis.com/");
		System.out.println("The login page is displayed");
	   
	}
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		dr.findElement(By.className("ico-login")).click();
	   
	}
	@When("user valid email")
	public void user_valid_email() {
		dr.findElement(By.name("Email")).sendKeys("archanadevirahul@gmail.com");  
	}
	@When("user valid password")
	public void user_valid_password() {
		dr.findElement(By.id("Password")).sendKeys("abc123"); 
	}
	@When("click login")
	public void click_login() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	}
	@Then("login has been done successfully")
	public void login_has_been_done_successfully() {
	String s=dr.findElement(By.xpath("//div[@class='header-links']/ul/li//a[@href='/customer/info']")).getText();
	System.out.println(s);
	Assert.assertEquals("archanadevirahul@gmail.com",s);
	   
	}
		
	
//	@When("User enters valid credentials and logs in")
//	public void user_enters_valid_credentials_and_logs_in() {
//		dr.findElement(By.id("Email")).sendKeys("archanadevirahul@gmail.com"); // Replace with valid email
//        dr.findElement(By.id("Password")).sendKeys("abc123"); // Replace with valid password
//        dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//        String s=dr.findElement(By.xpath("//div[@class='header-links']/ul/li//a[@href='/customer/info']")).getText();
//    	System.out.println(s);
//    	Assert.assertEquals("archanadevirahul@gmail.com",s);
//    }
//	@Then("User adds a book to the cart")
//	public void user_adds_a_book_to_the_cart() {
//		dr.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
//		dr.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
//	}
//	@Then("User updates the quantity to {int}")
//	public void user_updates_the_quantity_to(int quantity) {
//		dr.findElement(By.xpath("//li[@id='topcartlink']")).click();
//		WebElement quantityBox = dr.findElement(By.xpath("//input[contains(@class,'qty-input')]"));
//        quantityBox.clear();
//        quantityBox.sendKeys(String.valueOf(quantity));
//        dr.findElement(By.xpath("//input[@name='updatecart']")).click();
//    }
//	
//	@Then("User removes the item from the cart")
//	public void user_removes_the_item_from_the_cart() {
//		dr.findElement(By.xpath("//input[@name='removefromcart']")).click();
//        dr.findElement(By.xpath("//input[@name='updatecart']")).click();
//	}
////	@Then("User completes the order")
//	public void user_completes_the_order() {
//		dr.get("https://demowebshop.tricentis.com/books");
//		dr.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
//		dr.get("https://demowebshop.tricentis.com/cart");
//
//        // Proceed to checkout
//		dr.findElement(By.xpath("//button[@id='checkout']")).click();
//
//        // Billing Address
//		dr.findElement(By.xpath("//select[@name='billing_address_id']")).click();
//		dr.findElement(By.xpath("//input[@name='save']")).click();
//
//        // Shipping Method
//		dr.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
//		dr.findElement(By.xpath("//input[@name='save']")).click();
//
//        // Payment Method (Cash on Delivery)
//		dr.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
//		dr.findElement(By.xpath("//input[@name='save']")).click();
//
//        // Confirm Payment
//		dr.findElement(By.xpath("//input[@name='save']")).click();
//
//        // Confirm Order
//		dr.findElement(By.xpath("//input[@value='Confirm']")).click();
//
//        System.out.println("Order completed successfully!");
//        dr.quit();
//    }
	}

	
	
	
	
	
	

//	
//	@Given("home page is displayed")
//	public void home_page_is_displayed() {
//	    System.out.println("The home page is displayed");
//	}
//	@When("user clicks menu")
//	public void user_clicks_menu() {
//		dr.findElement(By.xpath("//ul[@class='top-menu']/li[1]/a")).click();
//	}
//	@When("user adds product to cart")
//	public void user_adds_product_to_cart() {
//		dr.findElement(By.xpath("//div[@class='product-grid']/div[5]//input[@class='button-2 product-box-add-to-cart-button']")).click();
//		dr.findElement(By.xpath("//li[@id='topcartlink']")).click();
//		
//	}
//	
//	@Then("cart should be updated")
//	public void cart_should_be_updated() throws InterruptedException {
//		String s1=dr.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).getDomProperty("value");
//		int num=Integer.parseInt(s1);
//		 assert num > 0 : "Cart was not updated properly!";
//		    System.out.println("Cart is updated with quantity: " + num);
//		    Thread.sleep(2000);
//		   // dr.findElement(By.name("continueshopping")).click();
//	}
//	
	
//	@When("user clicks quantity")
//	public void user_clicks_quantity() {
//		
//		//WebElement quantityField= dr.findElement(By.xpath("//tr[@class='cart-item-row']/td[5]/input[@class='qty-input valid'] "));
//		WebElement s2=dr.findElement(By.xpath("//tr[@class='cart-item-row']/td[5]/input[@class='qty-input valid']"));  
//		s2.clear();
//	       s2.sendKeys("3");
//	        dr.findElement(By.xpath("//tr[@class='cart-item-row']/td[5]/input[@class='qty-input valid']")).click();
//	}
//
//	@When("user clicks update cart")
//	public void user_clicks_update_cart() {
//		WebElement update = dr.findElement(By.name("updatecart"));
//        update.click();
//    }
//	
//
//	@Then("shopping cart is updated")
//	public void shopping_cart_is_updated() {
//		 
//       WebElement qty = dr.findElement(By.xpath("//input[contains(@class, 'qty-input')]"));
//        assertEquals("3", "value");
//	}


}

//WebElement quantityField = dr.findElement(By.xpath("(//input[contains(@class, 'qty-input')])[1]"));

//WebElement quantityField = dr.findElement(By.xpath("//form[@id='shopping-cart-form']//input[contains(@class, 'qty-input')]"));
//input[@name='itemquantity5230319']

//ul[@class='top-menu']/li[1]/a
//div[@class='product-grid']/div[5]//input[@class='button-2 product-box-add-to-cart-button']
//div[@class='bar-notification success']

//div/ul[@class='top-menu']/li[5]/a




//dr.findElement(By.className("ico-login")).click();
//
//dr.findElement(By.name("Email")).sendKeys("archanadevirahul@gmail.com");
//dr.findElement(By.id("Password")).sendKeys("abc123");
//dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();