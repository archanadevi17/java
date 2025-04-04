package assignments_sel;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class wait {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/slow");
		dr.manage().window().maximize();
		String s ="//p[@class=\"alert alert-info\"]";
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		WebElement a = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(s)));
		String message =a.getText();
		System.out.println("slow message:"+message);
	}

}
