package junitexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class testadd {

	@Test
	public void testsumwithEqualnums() {
		add_num obj = new add_num();
		int i,j;
		i=j=11;
	    System.err.println(" in testsumwithEqualnums");
	    assertEquals(i+j,obj.sum(i,j));
		
		
	}
	
	@Test
	public void testSum() {
		add_num a= new add_num();
		int i,j=10;
		i=5;
		System.out.println("in testsum");
		assertEquals(i+j,a.sum(i,j));
	
	}
		
}
