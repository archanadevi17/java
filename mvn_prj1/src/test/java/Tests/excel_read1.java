package Tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.login_page;
import POM.products_page;
import Utilities.common_methods;

public class excel_read1 extends common_methods{
	  login_page lp;
	  products_page pp;
	  String user;
	  String password;
	  Object[][] testdata = new Object[2][2];
	  static int row =0;
	  @BeforeMethod
	  public void beforeMethod() {
		  launch_chrome("https://www.saucedemo.com/");
		  lp=new login_page(dr);
		  pp=new products_page(dr);
	  }
 
	  @AfterMethod
	  public void afterMethod() {
		  dr.close();
	  }
	  @Test(dataProvider = "userpass")
	  public void test1(String user,String password) 
	  {
		  System.out.println("user: "+user +" password: "+password);
		  lp.name(user);
		  lp.password(password);
		  lp.click();
		  String t =pp.get_title();
		  Assert.assertEquals("Products",t);
	  }

	  @BeforeClass
	  public void get_excel() throws IOException
	  {
		    String filename="userdata.xlsx";
			String sheetname1= "Sheet1";
			FileInputStream fis =new FileInputStream(filename);
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			XSSFSheet sh1 = wb.getSheet(sheetname1);
			for(Row r:sh1)
			{
				if(r.getRowNum()==0) continue;
				 user=(String) r.getCell(1).getStringCellValue();
				 password =(String) r.getCell(2).getStringCellValue();
				 testdata[row][0]=user;
				 testdata[row][1]=password;
				 row++;
			}
	  }
	  @DataProvider(name ="userpass")
		 public Object[][] getdata()
		 {
		    return testdata;
		 }

}
































































//package Tests;
// 
//import java.io.FileInputStream;
//import java.io.IOException;
// 
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
// 
//
//import POM.login_page;
//import POM.products_page;
//import Utilities.common_methods;
// 
//public class excel_read1 extends common_methods{
//	  login_page lp;
//	  products_page pp;
//	  String user;
//	  String password;
//
//	  @AfterMethod
//	  public void afterMethod() {
//		  dr.close();
//	  }
//	  @Test
//	  public void test1() 
//	  {
//		  lp.name(user);
//		  lp.password(password);
//		  lp.click();
//		  String t =pp.get_title();
//		  Assert.assertEquals("Products",t);
//	  }
//	  @Test
//	  public void test2() 
//	  {
//		  lp.name(user);
//		  lp.password(password);
//		  lp.click();
//		  String t =pp.get_title();
//		  Assert.assertEquals("Products",t);
//	  }
//
//	  @BeforeMethod
//	  public void get_excel() throws IOException
//	  {
//		  launch_chrome("https://www.saucedemo.com/");
//		  lp=new login_page(dr);
//		  pp=new products_page(dr);
//		    String filename="excelreadlogin.xlsx";
//			String sheetname1= "Sheet1";
//			FileInputStream fis =new FileInputStream(filename);
//			XSSFWorkbook wb =new XSSFWorkbook(fis);
//			XSSFSheet sh1 = wb.getSheet(sheetname1);
//			for(Row r:sh1)
//			{
//				if(r.getRowNum()==0) continue;
//				 user =(String) r.getCell(1).getStringCellValue();
//				 password =(String) r.getCell(2).getStringCellValue();
//			}
//	  }
//}