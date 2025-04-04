package assignments_sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readthevalue {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/large");
		dr.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) dr;
        js.executeScript("window.scrollBy(0,5000)");
		WebElement a = dr.findElement(By.xpath("//tr[@class='row-20']/td[10]"));
		String a1 =a.getText();
		System.out.println("a1:"+a1);
		
	}

}