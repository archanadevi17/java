package assignments_sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickandalert {

	public static void main(String[] args) {
		WebDriver dr =new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		
		WebElement box =dr.findElement(By.xpath("//div[@id='hot-spot']"));
		
		Actions action = new Actions(dr);
		action.contextClick(box).perform();
		
		Alert a =dr.switchTo().alert();
        String alert_mess =a.getText();
        System.out.println("Alert message :"+ alert_mess);
        a.accept();
		
	}

}
