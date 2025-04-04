package assignments_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pagecontainthecheckbox {
@Test
public void test1() {
	
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio");
		dr.manage().window().maximize();
		
		String title =dr.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Checkboxradio | jQuery UI");

}

}