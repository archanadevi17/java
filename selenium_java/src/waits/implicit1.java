package waits;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class implicit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//dr.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		dr.findElement(By.id("user_name")).sendKeys("asdf");
		
		dr.close();
		dr.quit();
		
	}

}
