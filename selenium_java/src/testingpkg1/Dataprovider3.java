package testingpkg1;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Dataprovider3 {
	
	static WebDriver dr = new ChromeDriver();
	
	static int num=1;
	
	String xp_p1="//div[@class='inventory_list']/div[",
			xp_p3="]/div[2]//a/div";
	
	 
	 @DataProvider(name="Testdata")
		public Object[] getdata()
		{
		  Object[] e_product_names=new Object[] 
			  {"Sauce Labs Backpack", "Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket",
			  		 "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)"};
		
		  return e_product_names;
		  
		
}
	 
	 
	 @Test(dataProvider="Testdata")
	 public void testlogin(String e_pname)
	 {
		 System.out.println("Expected:" + e_pname);
		 String full_xp = xp_p1+num +xp_p3;
		 String a_pname=dr.findElement(By.xpath(full_xp)).getText();
		 System.out.println("actual:" + a_pname);
		num++;
		Assert.assertEquals(a_pname, e_pname);
		 
		 
	 } 
	 
	 
 @BeforeClass
 	public void beforeClass() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		   }
		   
}	 
		  
		  

