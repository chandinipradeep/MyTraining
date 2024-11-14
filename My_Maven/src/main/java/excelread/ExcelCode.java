package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	public static FileInputStream f;  //fetch file
	public static XSSFWorkbook w;  //fetch workbook
	public static XSSFSheet s;   // fetch excel sheet
	
	//to read string data from excel
	public static String readStringData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();  //method to fetch string value inside cell and return to main method
		
		
	}
	
	//to read integer data from excel
	public static double readIntegerData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx"); //give path of excel file
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1"); //method to get sheet from workbook
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue(); //method to fetch numeric values form cell and return to main method
	}

}
