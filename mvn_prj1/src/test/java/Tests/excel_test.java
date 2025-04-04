package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.login_page;
import POM.products_page;
import Utilities.common_methods;



public class excel_test extends common_methods {
	

	login_page lp;
	products_page pp;
	int r=0;
	static String u,p;
	@BeforeMethod
	public void bm()throws IOException{
	{
		launch_chrome("https://www.saucedemo.com");
		lp=new login_page(dr);
		pp=new products_page(dr);
		int r = 0;
		u=read_excel(r,0);
		p=read_excel(r,1);
		r++;
	}
	}	
	
  @Test
  public void test1() {
	  
	  lp.enter_name("u");
		lp.enter_pwd("p");
		lp.click_login();
		String atitle=pp.get_title();
		Assert.assertEquals("Products", atitle);
		
	  
  } 
  
	
  @Test
  public void test2() {
	  
	  lp.enter_name("u");
		lp.enter_pwd("p");
		lp.click_login();
		String atitle=pp.get_title();
		Assert.assertEquals("Products", atitle);
		
	  
  } 
	  
  }

