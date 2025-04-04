package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import POM.login_page;
import POM.products_page;
import Utilities.common_methods;

@Test
public class testsfor_login_and_product extends common_methods{
	
	
	login_page lp;
	products_page pp;
	
	@BeforeMethod
	public void bm()
	{
		launch_chrome("https://www.saucedemo.com");
		lp=new login_page(dr);
		pp=new products_page(dr);
	}
	
	@AfterMethod
	public void am()
	{
		dr.close();
	}
	
	public void test1()
	{
		lp.enter_name("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		String atitle=pp.get_title();
		Assert.assertEquals("Products", atitle);
		
	}
	  public void test2()
	{
		lp.enter_name("standard_user");
		lp.enter_pwd("secret_sauce");
		lp.click_login();
		String atitle=pp.get_title();
		Assert.assertEquals("Products1", atitle);
		
	}
	

  }

