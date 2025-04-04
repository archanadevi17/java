package assignments_sel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	public static void main(String[] args) {
	WebDriver dr = new ChromeDriver();
	dr.get("https://jqueryui.com/selectmenu");
	dr.manage().window().maximize();
	WebElement w= dr.findElement(By.xpath("//iframe"));
    dr.switchTo().frame(w);
	
	dr.findElement(By.xpath("//span[@id=\"speed-button\"]")).click();
	dr.findElement(By.xpath("//div[@id=\"ui-id-2\"]")).click();
	
	dr.findElement(By.xpath("//span[@id=\"number-button\"]")).click();
	dr.findElement(By.xpath("//div[@id=\"ui-id-9\"]")).click();
	//span[@id="number-button"]
	
	
	}
}