package testingpkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class Factoryeg1 {
	private String browser;
	 WebDriver dr;

	public  Factoryeg1(String browser)
	 {
		 this.browser=browser;
	 }
	
@Test
public void test()
{

	  switch(browser) 
	  {
	  case "Chrome":
		  System.out.println("running test:" +browser);
		  dr=new ChromeDriver();
		
		  break;
		 
	  case "Edge":
		  System.out.println("running test:" +browser);
		  dr=new EdgeDriver();
		  break;
		  
		  
	  case"FireFox":
		  System.out.println("running test:" +browser);
		 dr=new FirefoxDriver();
		  break;
		  
	  }
	  
}

@AfterMethod
public void launch_app(String username,String password,String input)
{
		
			dr.get("https://demowebshop.tricentis.com");
		    dr.manage().window().maximize();
		    dr.findElement(By.id("User_name")).sendKeys(username);
			dr.findElement(By.name("Password")).sendKeys(password);
			dr.findElement(By.xpath("//a[@href='/login']")).click();

}

  @Factory
  public static Object[] factoryMethod() {
	  Object [] bro= {
			  
			  
			  	new Factoryeg1("Chrome"),
			  	new Factoryeg1("Edge"),
				new Factoryeg1("Firefox"),
				
	  };
	  return bro;
  }
  

//  		public void AfterMethod(t) {
//			WebDriver dr=new ChromeDriver();
//			
//	dr.get("https://demowebshop.tricentis.com");
//			
//			
//			
//			
		

	}
  
  
  

