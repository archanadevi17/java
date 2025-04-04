package testingpkg1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {
	
	
	 
	 @DataProvider(name="Testdata")
		public Object[] getdata()
		{
		  Object[] testdata=new Object[] 
			  {"user1", "user2","user3","user4"};
	
			  
			
			
		  return testdata;
		  
		
}
	 
	 @Test(dataProvider="Testdata")
	 public void testlogin(String uid)
	 {
		
		 System.out.println("User ID:" +uid );
	 }
}
