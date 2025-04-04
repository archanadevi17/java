package com.selenium.proj1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_excel {
 
	public static String write_update() throws IOException {
		String filename="data.xlsx";
		 String Sheetname="Sheet1";
		 
		 FileInputStream fis = new FileInputStream(filename);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sh = wb.getSheet(Sheetname);
		 
		 
		 XSSFRow r=sh.getRow(0);
		 XSSFCell cell1 = r.getCell(3);
		 String s=cell1.getStringCellValue();
		
		 XSSFCell cell2 = r.createCell(2);
		 
		 cell2.setCellValue("Google");
		 
		 FileOutputStream fos = new FileOutputStream(filename);
		 wb.write(fos);
		 
		 fos.close();
		 wb.close();
		return s;
	
		
	}
public static void main(String[] args)throws IOException {
	// TODO Auto-generated method stub
	String  a=write_update();
	System.out.println("String update=" + a);

}
}
