package JSExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse1 {   //SCROLL WEBPAGE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://demowebshop.tricentis.com");
		
		
		JavascriptExecutor jse=(JavascriptExecutor) dr;
		jse.executeScript("window.scrollBy(0,400)");

	}

}
