package assignments_sel;



	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class loginusejs {

		public static void main(String[] args) {
			WebDriver dr = new ChromeDriver();
			dr.get("https://www.saucedemo.com/");
			
			JavascriptExecutor j =(JavascriptExecutor) dr;
			WebElement username= dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		    j.executeScript("arguments[0].value ='standard_user';", username);
		    
		    WebElement password= dr.findElement(By.xpath("//*[@id='password']"));
		    j.executeScript("arguments[0].value ='secret_sauce';", password);
		    
		    
		    WebElement click= dr.findElement(By.id("login-button"));
		    j.executeScript("arguments[0].click();", click);
		    
		    

		}

	}
