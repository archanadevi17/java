package testingpkg1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


@Test
public class testsuite_tc_2  {
	
public void test1 (){
	  
	  //Launch_chrome("https://demowebshop.tricents.com/");
	
	  WebDriver dr=new EdgeDriver();
	  dr.get("https://demowebshop.tricentis.com");
	  LocalDateTime myDateObj=LocalDateTime.now();
	  DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  String formattedDate=myDateObj.format(myFormatObj);
	  System.out.println("In test1-After formatting: "+ formattedDate);
	 
  }
}