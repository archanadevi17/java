package junitassignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)

public class param extends avgstu {

	public param(int ai, int ds, int ml, int ex_op) {
		super(ai, ds, ml, ex_op);
		// TODO Auto-generated constructor stub
	}

		
		
		//parameters for the test
		@Parameterized.Parameters
		public static List<Object[]>data()
		{
			System.out.println("in data method");
			//here the object b array is created as 2d array but ,
			//while converting it into the list it is stored as 1d array as each cell in list stores 1d array
			Object b[][]=new Object [][] {
				{80,80,80,80},
				{90,90,90,90},
				{98,98,98,98},
				{97,97,97,97},
				{100,100,100,100}
			};
			List<Object[]> c= Arrays.asList(b);
			return c;
		}
		
		@Test
		public void test() {
			System.out.println("ai: " + ai + " ds: " + ds + " ml: " + ml + " avg: "+  ex_op);
			assertEquals(ex_op,calcavg(ai,ds,ml));
			}
	}



		
	