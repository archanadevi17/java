package junitexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class testsub {

	@Test
	public void test1() {
			sub_num a= new sub_num();
		
			System.out.println("in testsub test1");
			assertEquals(7,a.sum(13,6));
		
	}


	@Test
	public void test2() {
			sub_num b= new sub_num();
		
			System.out.println("in testsub test1");
			assertEquals(-8,b.sum(-11,-3));
		
	}
}
