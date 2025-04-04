package assignments_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardoperations {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		WebElement w1 =dr.findElement(By.xpath("//input[@id='user-name']"));
		
		
		Actions act = new Actions(dr);
		act.click(w1).keyDown(Keys.SHIFT).sendKeys("asd").keyUp(Keys.SHIFT).sendKeys("qwe").perform();
		
		
	}

}