package testingpkg1;

import org.testng.annotations.Test;

public class Newgroup {
  @Test(groups= {"F1","F2"})
  public void Sanitytest1() {
	  System.out.println("Executing F2 and F1 testcases");
  }
  
  @Test(groups= {"F1"})
  public void regressiontestiong1() {
	  System.out.println("Executing  F1 testcases");
  }
  @Test(groups= {"F2"})
  public void Sanitytest2() {
	  System.out.println("Executing F2 testcases");
  }
  @Test(groups= {"F1"})
  public void regressiontestiong2() {
	  System.out.println("Executing F1 testcases");
  }
  
  
}
