package junitexample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	junitexample.testadd.class,
	junitexample.testsub.class })



public class test_suite {
		
}
