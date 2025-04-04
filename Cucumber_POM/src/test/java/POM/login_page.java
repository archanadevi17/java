package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
			
		WebDriver dr;
		@FindBy(xpath="//input[@name='user-name']")// used instead of findElement in dr
		WebElement unameexp;
		
		
		@FindBy(xpath="//input[@name='password']")// used instead of findElement in dr
		WebElement pwdexp;
		
		@FindBy(xpath="//input[@id='login-button']")// used instead of findElement in dr
		WebElement btn;
		
		
			public login_page(WebDriver dr)
			{
				this.dr=dr;
				PageFactory.initElements(dr, this);
			}
			public void enter_name(String un)
			{
				unameexp.sendKeys(un);
			}
			
			public  void enter_pwd(String pwd)
			{
				pwdexp.sendKeys(pwd);
			}
			public void click_login()
			{
				btn.click();
			}
			
			
		
}


