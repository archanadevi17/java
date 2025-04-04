package Utility3;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
 
public class common3 {

	public static WebDriver dr;
 
	public static void launch_chrome(String url)

	{

		dr = new ChromeDriver();

		dr.get(url);

		dr.manage().window().maximize();

	}

	public static void launch_edge(String url)

	{

		dr = new EdgeDriver();

		dr.get(url);

		dr.manage().window().maximize();

	}

	public static void launch_firefox(String url)

	{

		dr = new FirefoxDriver();

		dr.get(url);

		dr.manage().window().maximize();

	}
 
}