package junitfixtures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitfile1 {

	@BeforeClass
	public static void BeforeClass()  {
		System.out.println("in before class");
	}

	@AfterClass
	public  static void AfterClass() {
		System.out.println("in after class");
	}
	
	@Before
	public  void setup()  {
		System.out.println("in setup");
	}
	
	@After
	public  void teardown()  {
		System.out.println("in teardown");
	}
	
	
	@Test
	public void test1() {
		System.out.println("in test1");
	}

	
	@Test
	public void test2() {
		System.out.println("in test2");
	}

}
