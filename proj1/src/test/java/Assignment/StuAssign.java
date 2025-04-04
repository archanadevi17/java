package Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
 
 
 
 
 
public class StuAssign {
	static HashMap<Integer,student> h= new HashMap<Integer,student>();
	
	public static void excel_read() throws IOException
	{
		String filename="Assign.xlsx";
		String sheetname1= "Sheet1";
		String sheetname2= "Sheet2";
		
		FileInputStream fis =new FileInputStream(filename);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet(sheetname1);
		XSSFSheet sh2 = wb.getSheet(sheetname2);
		for(Row r:sh1)
		{
			if(r.getRowNum()==0) continue;
			
			int sid =(int) r.getCell(0).getNumericCellValue();
			double Maths =(int) r.getCell(1).getNumericCellValue();
			double Phy =(int) r.getCell(2).getNumericCellValue();
			double Average=student.Average(Maths,Phy);
			student Stu =new student(sid,Maths,Phy,Average);
			h.put(sid, s);
		}
		
		wb.close();
		fis.close();
		
	}
	
	
	public static void create_write() throws IOException
	{
		String filename="student.xlsx";
		String sheetname2= "Sheet2";
		FileInputStream fis =new FileInputStream(filename);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sh2 = wb.getSheet(sheetname2);
		int i=0;
		for(Row r:sh2)
		{   
			XSSFRow r1 =sh2.getRow(r.getRowNum());
			System.out.println("r:"+r.getRowNum());
			System.out.println("r1:"+r1.getRowNum());
			XSSFCell cell3 = r1.createCell(3);
			if((r.getRowNum()==0))
				{
				  cell3.setCellValue("average");
				  System.out.println("average");
				  continue;
				}
			
			int id =(int) r.getCell(0).getNumericCellValue();
			System.out.println("id : "+id);
			for(Entry<Integer,student> e :h.entrySet())
			{
				student s =e.getValue();
				
			    if(id==e.getKey())
			    {
			    	cell3.setCellValue(s.a);
			    	System.out.println("a : "+s.a);
			    }
			}
			i++;
			
		}
		
		FileOutputStream fos =new FileOutputStream(filename);
		wb.write(fos);
		fos.close();
		wb.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		excel_read();
		for(Entry<Integer,student> e :h.entrySet())
		{
			student s =e.getValue();
			System.out.println("id:" + e.getKey()+"    mat:"+s.Maths  + "      phy:"+ s.Phy+"      avg:"+ s.a+"\n");
		}
		create_write();
	}
 
}