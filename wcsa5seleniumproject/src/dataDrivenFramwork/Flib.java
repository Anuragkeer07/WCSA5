package dataDrivenFramwork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib
{
	// it is use for read the excel 
	public String readExcelData(String excelpath,String filename,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(filename);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data; 
		
	}
	// it is use for get the last row count from the sheet
	public int getRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	public void writeExcelData(String excelpath,String sheetName,int rownum,int rowcreate,int cellcreate) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowcreate);
		row.setRowNum(rownum);
		Cell cell = row.createCell(cellcreate);
		cell.setCellValue("India");
		FileOutputStream fos = new FileOutputStream("./Data/actitimelogin.xlsx");
		wb.write(fos);
	}
	
	

}
