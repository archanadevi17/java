package com.selenium.proj1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_operations {
	
	int lastrownum,lastcellnum;
	

	public static String excel_read() throws IOException {
		 String filename="data.xlsx";
		 String Sheetname="Sheet1";
		 
		 FileInputStream fis = new FileInputStream(filename);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sh = wb.getSheet(Sheetname);
		 
		 
		 XSSFRow r=sh.getRow(0);
		 XSSFCell cell = r.getCell(1);
		 String s= cell.getStringCellValue();
		
		
		return s;
	

	}
	public static void main(String args[]) throws IOException {
		excel_read();
		
		System.out.println("String s=" +excel_read());
	}

}
