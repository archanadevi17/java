package adv_features;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

import Utilities.common_methods;

public class rel_locators extends common_methods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch_edge("https://www.saucedemo.com/");
		By emaillocator=RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(emaillocator).sendKeys("standard_user");
		
		By passwdlocator =RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(passwdlocator).sendKeys("secret_sauce");
	}

}
