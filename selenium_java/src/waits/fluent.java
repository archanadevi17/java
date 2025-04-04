package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com");
		
		String xp="//div[@class='block block-category-navigation']/div[2]/ul/li//a[@href='/books']";
		Wait<WebDriver>wt=new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement we1=wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
		we1.click();
	}

}
