package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class common_methods{    


public static WebDriver dr;

	static String filename="excelreadlogin.xlsx";
	static String Sheetname="Sheet1";

	 
 public static void launch_chrome(String url)
	{
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
				
	}
		 
	
		 
	 public static String read_excel(int row, int col)throws IOException {
	 FileInputStream fis = new FileInputStream(filename);
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 XSSFSheet sh = wb.getSheet(Sheetname);
	 
	 
	 XSSFRow r=sh.getRow(0);
	 XSSFCell cell = r.getCell(1);
	 String s= cell.getStringCellValue();
	 return s;
	 }
	 
	 
}