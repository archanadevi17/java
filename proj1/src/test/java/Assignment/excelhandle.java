package Assignment;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.poifs.filesystem.BlockStore;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelhandle {
	
	private static String filename="Assign.xlsx";

	public static void main(String[] args)throws IOException {
		 HashMap<Integer,student>StudentMap1=readandcalculateaverage();
//        readData(marksMap, studentMap);
//        calculateAndWriteAverage(marksMap, studentMap);
//        System.out.println("Excel Updated Successfully!");
    }

    public static HashMap<Integer, student>readandcalculateaverage()throws IOException 
    {
        
    		FileInputStream fis = new FileInputStream(filename);
            XSSFWorkbook wb= new XSSFWorkbook(fis); {
            XSSFSheet sh = wb.getSheet("Sheet1");
    	
            HashMap<Integer,student>StudentMap=new HashMap<>();
            
            for (Row r : sh) 
            {
                if (r.getRowNum()==0)
                	
                	continue; 
                
                
                int sid = (int) r.getCell(0).getNumericCellValue();
                double Maths = r.getCell(1).getNumericCellValue();
                double Phy = r.getCell(2).getNumericCellValue();
                
                student Stu=new student(sid,Maths,Phy);
                StudentMap.put(sid,Stu);
                
            }

            
            wb.close();
            fis.close();
            System.out.println("Excel Updated Successfully!");
            return StudentMap;
            
            }
            
    }
            public static HashMap<Integer, student> throws IOException() 
            {
            
            	FileInputStream fis1 = new FileInputStream(filename);
                XSSFWorkbook wb1= new XSSFWorkbook(fis1); {
                XSSFSheet sh2 = wb1.getSheet("Sheet2");
        	
                HashMap<Integer,student>StudentMap=new HashMap<>();
                
                for (Row r : sh2) 
                {
                    if (r.getRowNum()==0)
                    	
                    	continue; 
                    
                    
                    int sid = (int) r.getCell(0).getNumericCellValue();
                    String Stu_name  = r.getCell(1).getStringCellValue();
                    String Sem  = r.getCell(2).getStringCellValue();
                    StudentMap.put(sid, Stu_name, Sem, sid, sid);
                }

                
                wb1.close();
                fis1.close();
                System.out.println("Excel Updated Successfully!");
                return StudentMap;
                
                }	
            }
            	
 	
            	
  
    }

    public static void calculateAndWriteAverage(Map<Integer, student> marksMap, Map<Integer, student> studentMap) {
        try (FileInputStream fis = new FileInputStream(filename);
             XSSFWorkbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(filename)) {

            XSSFSheet sheet = workbook.getSheetAt(1); // Student details sheet

            // Write "Average" header if not present
            Row headerRow = sheet.getRow(0);
            Cell headerCell = headerRow.createCell(3);
            headerCell.setCellValue("Average");

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header
                int sid = (int) row.getCell(0).getNumericCellValue();

                if (marksMap.containsKey(sid) && studentMap.containsKey(sid)) {
                    student marks = marksMap.get(sid);
                    double average = (marks[0] + marks[1]) / 2;

                    // Update Student Object
                    studentMap.get(sid).setAverage(average);

                    // Write to Excel
                    Cell cell = row.createCell(3);
                    cell.setCellValue(average);
                }
            }

            workbook.write(fos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
