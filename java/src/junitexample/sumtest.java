package junitexample;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class sumtest {

	sumeven s;
	    int n = 94382;

	    @Test
	    public void test() {
	        s = new sumeven();
	        System.out.println("in test:");
	        int m = s.add(n);
	        assertEquals(m, 150);
	    }

	    @Test
	    public void test1() {
	        s = new sumeven();
	        System.out.println("in test1:");
	        int m = s.add(n);
	        assertEquals(m, 14);
	    }
	}

