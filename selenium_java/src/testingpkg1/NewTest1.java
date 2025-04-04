package testingpkg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest1 {
 

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass");
	  }

		
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod");
	  }
	
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod");
	  }
	
	  @Test
	  public void test1() {
		  System.out.println("test1");
	  }
	
	  @Test
	  public void test2() {
		  System.out.println("test2");
	  }
	
	
	  @Test
	  public void test3() {
		  System.out.println("test3");
	  }

}
