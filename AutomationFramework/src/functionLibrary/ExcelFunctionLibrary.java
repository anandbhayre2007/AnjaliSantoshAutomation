package functionLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelFunctionLibrary {

	HSSFWorkbook wb;
	String path;

	public ExcelFunctionLibrary(String path) throws IOException {
		this.path = path;

		FileInputStream file = new FileInputStream(path);

		// Step 3
		wb = new HSSFWorkbook(file);
	}

	public String getCelllData(String sheetName, int rowNumber, int colNumber) throws IOException {

		// Step 4
		HSSFSheet sheet = wb.getSheet(sheetName);

		// Step 5
		HSSFRow row = sheet.getRow(rowNumber);

		// Step 6
		HSSFCell cell = row.getCell(colNumber);

		// Step 7
		String data = cell.getStringCellValue();

		return data;
	}

	public void setCelllData(String sheetName, int rowNumber, int colNumber, String value) throws IOException {
		// Step 4
		HSSFSheet sheet = wb.getSheet(sheetName);

		// Step 5
		HSSFRow row = sheet.getRow(rowNumber);
		if (row == null)
			row = sheet.createRow(rowNumber);

		// Step 6
		HSSFCell cell = row.getCell(colNumber);
		if (cell == null)
			cell = row.createCell(colNumber);

		// Step 7
		cell.setCellValue(value);

		// Step 8
		FileOutputStream fileOut = new FileOutputStream(path);

		wb.write(fileOut);

	}

	public int getNumberOfRows(String sheetName) throws IOException {

		// Step 4
		HSSFSheet sheet = wb.getSheet(sheetName);

		return sheet.getPhysicalNumberOfRows();
	}

	public int getNumberOfColumns(String sheetName, int rowNumber) throws IOException {
		// Step 4
		HSSFSheet sheet = wb.getSheet(sheetName);

		return sheet.getRow(rowNumber).getPhysicalNumberOfCells();
	}

	public int getNumberOfColumns(String sheetName) throws IOException {

		// Step 4
		HSSFSheet sheet = wb.getSheet(sheetName);

		return sheet.getRow(0).getPhysicalNumberOfCells();
	}
}
