package testingpkg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Parametrization {
	
  @Test
  @Parameters({"Archa"})
  public void testwithparameters(String Archa) {
	  System.out.println("Running tests on Archa :" + Archa);
  }
  
  
  @Test
  @Parameters({"Rahul"})
  public void testwithparameters1(String Rahul) {
	  System.out.println("Running tests on Rahul :" + Rahul);
  }
}
