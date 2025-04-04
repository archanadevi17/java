package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class timeout_test1 {

// time within sleep should be less than time mentioned in timeout
	@Test(timeout=2000)
	public void testTimeout()throws InterruptedException {
		Thread.sleep(1500);
	}
//	@Test(timeout=1500)
//	public void testTimeout()throws InterruptedException {
//		Thread.sleep(1500);
//	}
//	@Test(timeout=1000)
//	public void testTimeout()throws InterruptedException {
//		Thread.sleep(1500);
//	}


}
