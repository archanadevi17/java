package basic_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jqueryui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver dr=new ChromeDriver();
		dr.get("https://jqueryui.com/");
		
		dr.findElement(By.xpath("//a[@href='https://jqueryui.com/checkboxradio/']")).click();
		//dr.findElement(By.xpath("//*test()='Checkboxradio']")).click();
		
		WebElement we1=dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we1);
		dr.findElement(By.xpath("//label[@for='radio-1']")).click();
		
	}

}
