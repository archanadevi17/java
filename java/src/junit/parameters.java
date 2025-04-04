package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)// this keyword should be added when parametrs are used in junit
public class parameters {
	private int n1,n2,ex_op;
	//constructor takes parameters for each test instance
	public parameters(int n1,int n2, int ex_op) {
		this.n1=n1;
		this.n2=n2;
		this.ex_op=ex_op;
		System.out.println("in constructor");
	}
	
	
	//parameters for the test
	@Parameterized.Parameters
	public static List<Object[]>data()
	{
		System.out.println("in data method");
		//here the object b array is created as 2d array but ,
		//while converting it into the list it is stored as 1d array as each cell in list stores 1d array
		Object b[][]=new Object [][] {
			{1,2,3},
			{4,5,9},
			{5,6,11},
			{-9,-2,-11}
		};
		List<Object[]> c= Arrays.asList(b);
		return c;
	}
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("in sum");
		return c;
	}

	@Test
	public void test() {
		System.out.println("n1: " + n1 + " n2: " + n2 + " ex_op: " + ex_op);
		assertEquals(ex_op,sum(n1,n2));
	}

}
