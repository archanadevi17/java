package listener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener1.class)
public class listener_report {
  @Test
  public void test1() 
  {
	  System.out.println("in the test1 class");
	  Assert.assertEquals(false, false);
  }
  @Test
  public void test2() 
  {
	  System.out.println("in the test2 class");
	  Assert.assertEquals(true, false);
  }
}