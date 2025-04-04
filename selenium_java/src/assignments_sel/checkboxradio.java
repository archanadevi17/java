package assignments_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxradio {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio");
		dr.manage().window().maximize();
		
		WebElement w= dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    dr.switchTo().frame(w);
        dr.findElement(By.xpath("//label[@for='checkbox-4']//span[1]")).click();
        dr.findElement(By.xpath("//label[@for='checkbox-3']//span[1]")).click();
        
        dr.findElement(By.xpath("//label[@for ='radio-3']")).click();
        dr.close();

}
}
