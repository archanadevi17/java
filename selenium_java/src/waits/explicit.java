package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com");
		
		WebDriverWait wt=new WebDriverWait(dr,Duration.ofMillis(2000));
		//<a href="/login" class="ico-login">Log in</a>
		WebElement ele=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']")));
		ele.click();

	}

}

