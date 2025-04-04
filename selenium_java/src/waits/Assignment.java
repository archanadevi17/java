package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		
			dr.get("https://the-internet.herokuapp.com/dynamic_controls");
			WebDriverWait wt=new WebDriverWait(dr,Duration.ofSeconds(5));
			
			WebElement remove=dr.findElement(By.xpath("//button[contains(text(),'Remove')]"));
			remove.click();

			WebElement add=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div/div[1]/form[1]/button")));
			add.click();

			WebElement checkbox=wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
			if (checkbox.isDisplayed()) {
				System.out.println("checkbox appeared successfully");
			}
		}
//dr.close();
	}

//html/body/div[2]/div/div[1]/form[1]/button
//button[contains(text(),'Add')]