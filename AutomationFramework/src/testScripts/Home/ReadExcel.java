package testScripts.Home;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcel {
	
	public static void main (String[] args) throws IOException
	{
		String filePath = "E:\\Automation\\GitRepo\\AutomationFramework\\src\\testData\\TestData.xls";
		
		FileInputStream file = new FileInputStream(filePath);
		
		Workbook wb = new HSSFWorkbook(file);
		
		Sheet sheetName = wb.getSheet("Sheet1");
	
		Row row = sheetName.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
	}
	
	public int getRowCount(String filePath, String sheetName) throws IOException
	{
		
		FileInputStream file = new FileInputStream(filePath);
		
		Workbook wb = new HSSFWorkbook(file);
		
		Sheet sheet = wb.getSheet(sheetName);
	
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int getColumnCount(String filePath, String sheetName) throws IOException
	{
		
		FileInputStream file = new FileInputStream(filePath);
		
		Workbook wb = new HSSFWorkbook(file);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(0);
		
		return row.getPhysicalNumberOfCells();
	}

	public String getCellData(String filePath, String sheetName, int rowNum , int ColNum) throws IOException
	{
       FileInputStream file = new FileInputStream(filePath);
		
		Workbook wb = new HSSFWorkbook(file);
	
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNum);
		
		Cell cell = row.getCell(ColNum);
		String data = cell.getStringCellValue();
		return data;
	}
}
