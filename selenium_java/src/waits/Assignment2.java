package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebDriverWait wt=new WebDriverWait(dr,Duration.ofSeconds(5));
		
		WebElement enable=dr.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		enable.click();
		WebElement input=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/input[@type='text']")));
		
		input.sendKeys("AR");
		System.out.println("Text Entered Successfully");

	}

}
