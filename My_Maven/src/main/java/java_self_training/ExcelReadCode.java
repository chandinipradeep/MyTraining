package java_self_training;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCode {

	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	
	public static String readStringData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet2");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
	}
	
	public static double readIntData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\jishn\\Desktop\\Excelread.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet2");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getNumericCellValue();
	}
	
}
 