package basic_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public void logfun(String username,String password,String input) {
		WebDriver dr=new ChromeDriver();
		
dr.get("https://www.saucedemo.com");
		
		
		dr.findElement(By.id("User_name")).sendKeys(username);
		dr.findElement(By.name("Password")).sendKeys(password);
		dr.findElement(By.id("login-button")).click();
		
		String b=dr.findElement(By.xpath("//div[@class='error-message-container error']/h3")).getText();
		
		if(b.equals("products"))
		{
			System.out.println("The actual text is same as expected");
		}
		else
		{
			System.out.println("The actual test is not same as expected");
		}
		
	}

}
