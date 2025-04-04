package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class exception_test1 {


	@Test(expected=ArithmeticException.class)
	public void testDividebyZero() {
		int a = 1/0;
	}
//	@Test(expected=ArithmeticException.class)
//	public void testDividebyZero() {
//		int a = 1/1;   doesn't trigger the exception
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void arrayoutofbound() {
		int[]arr=new int[4];
		arr[10]=10;
	}
//	@Test(expected=ArrayIndexOutOfBoundsException.class)
//	public void arrayoutofbound() {
//		int[]arr=new int[4];
//		arr[3]=3      index is given within boundary
}
