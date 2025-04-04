package assignments_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/drag-and-drop");
		
		dr.manage().window().maximize();
		WebElement w1 =dr.findElement(By.xpath("//div[@id='column-a']"));
		WebElement w2 =dr.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act = new Actions(dr);
		act.dragAndDrop(w1,w2).perform();

	}

}