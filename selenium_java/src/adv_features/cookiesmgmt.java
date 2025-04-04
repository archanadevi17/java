package adv_features;

import org.openqa.selenium.Cookie;

import Utilities.common_methods;

public class cookiesmgmt extends common_methods {
	
	
	public static void addCookie(String cname,String cvalue)
	{
		Cookie c=new Cookie(cname,cvalue);
		dr.manage().addCookie(c);
	}
	public static void display_cookie()
	{
		for(Cookie c: dr.manage().getCookies())
		{
			System.out.println("name: " + c.getName() + " value: " + c.getValue());
			
		}
	}
	public static void delete_cookie(String cname)
	{
		dr.manage().deleteCookieNamed(cname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch_edge("https://www.myntra.com");
		addCookie("UserSession","123456");
		addCookie("Place","Banglore");
		addCookie("Page","Products Page");
		
		display_cookie();
		
		delete_cookie("Place");
		
		
		if (dr.manage().getCookieNamed("Place")==null)
			System.out.println("TestCookie Successfully deleted");
		
		else
			System.out.println("not deleted");
		
		

	}

}
