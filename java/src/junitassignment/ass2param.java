package junitassignment;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ass2param {
	private static param param2;
				static Object [][] a = {
					{80,80,80,80},
					{90,90,90,90},
					{98,98,98,98},
					{97,97,97,97},
					
				};
		
				@BeforeClass
				public static void BeforeClass()  {
					System.out.println("in before class");
					int ai=(int) a[0][0];
					int ds=(int) a[0][1];
					int ml=(int) a[0][2];
					int ex_op=(int) a[0][3];
					param2 = new param (ai,ds,ml,ex_op);
					int result = param2.calcavg(ai,ds,ml);
					System.out.println("ai: " + ai + " ds: " + ds + " ml: " + ml + " avg: "+  ex_op);
					assertEquals(ex_op,result);
				}
				@Test
				public  void test1() {
					System.out.println("in test1");
					int ai=(int) a[1][0];
					int ds=(int) a[1][1];
					int ml=(int) a[1][2];
					int ex_op=(int) a[1][3];
					param2 = new param (ai,ds,ml,ex_op);
					int result = param2.calcavg(ai,ds,ml);
					System.out.println("ai: " + ai + " ds: " + ds + " ml: " + ml + " avg: "+  ex_op);
					assertEquals(ex_op,result);
				}
			

				@Test
				public  void test2() {
					System.out.println("in test2");
					int ai=(int) a[2][0];
					int ds=(int) a[2][1];
					int ml=(int) a[2][2];
					int ex_op=(int) a[2][3];
					param2 = new param (ai,ds,ml,ex_op);
					int result = param2.calcavg(ai,ds,ml);
					System.out.println("ai: " + ai + " ds: " + ds + " ml: " + ml + " avg: "+  ex_op);
					assertEquals(ex_op,result);
				}
				@AfterClass
				public static void AfterClass() {
					System.out.println("in after class");
					int ai=(int) a[3][0];
					int ds=(int) a[3][1];
					int ml=(int) a[3][2];
					int ex_op=(int) a[3][3];
					 param2 = new param (ai,ds,ml,ex_op);
					int result = param2.calcavg(ai,ds,ml);
					System.out.println("ai: " + ai + " ds: " + ds + " ml: " + ml + " avg: "+  ex_op);
					assertEquals(ex_op,result);
				}
	}
