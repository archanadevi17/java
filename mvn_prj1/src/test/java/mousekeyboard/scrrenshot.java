package mousekeyboard;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrrenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.saucedemo.com");
		dr.manage().window().maximize();
		
		TakesScreenshot ss=((TakesScreenshot)dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\archanadevi.s\\Screenshot\\5.png");
		FileUtils.copyFile(srcf,destfile);
		
		
		

	}

}
