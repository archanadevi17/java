package testingpkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency1 {
  @Test
  public void login() {
	  System.out.println("login successful");
	  Assert.assertEquals(true, true);
  }
   @Test(dependsOnMethods="login")
   
	   public void verifyDashboard()
	   {
		   System.out.println("Dashboard verification passed");
	   }
}


