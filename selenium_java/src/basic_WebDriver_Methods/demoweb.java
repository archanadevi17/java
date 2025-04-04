package basic_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr=new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.className("ico-login")).click();
	
		dr.findElement(By.name("Email")).sendKeys("archanadevirahul@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("abc123");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']")).click();
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]/ul/li//a[@href='/books']")).click();
		dr.findElement(By.xpath("//div[@class='details']/h2//a[@href='/computing-and-internet']")).click();
		dr.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		
		//dr.findElement(By.xpath("//input[@class='/141-inch-laptop']")).click();
		
		
		
		//dr.findElement(By.xpath("//input[@class=button-2 product-box-add-to-cart-button']")).click();
		
		
//		WebElement we1=dr.findElement(By.name("products-orderby"));
//		Select sel=new Select(we1);
//		sel.selectByIndex(2);
//		
		
	}

}
