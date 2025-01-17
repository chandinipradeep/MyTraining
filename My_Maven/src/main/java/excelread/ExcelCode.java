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
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx"); //give path of excel file
		w=new XSSFWorkbook(f); //method to fetch workbook from file
		s=w.getSheet("Sheet1"); //method to get sheet from workbook
		XSSFRow r=s.getRow(i); //method to get row from sheet
		XSSFCell c=r.getCell(j); //method to get column
		return c.getStringCellValue();  //method to fetch string value inside cell and return to main method
		 
	}
	
	//to read integer data from excel
	public static double readIntegerData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx"); //give path of excel file
		w=new XSSFWorkbook(f); //method to fetch workbook from file
		s=w.getSheet("Sheet1"); //method to get sheet from workbook
		XSSFRow r=s.getRow(i); //method to get row from sheet
		XSSFCell c=r.getCell(j);//method to get column ; cell is dependent row, thats why we are giving r.getCell()
		return c.getNumericCellValue(); //method to fetch numeric values form cell and return to main method
	}

}

