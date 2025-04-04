package basic_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com");
		
		
		dr.findElement(By.id("user_name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		String s=dr.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println("Text Read = " + s);
		
		if(s.equals("products1"))
		{
			System.out.println("The actual text is same as expected");
		}
		else
		{
			System.out.println("the actual test is not as same as expected.");
		}
		
		
		
		
		//xpath=//tagname[@attribute='value']
		// xpath=//span[@class='title'] 
		
		
		
		

	}

}
