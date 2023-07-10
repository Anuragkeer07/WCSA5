package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet("IPL");
		 
		// Row row = sheet.getRow(12);
		 
		 // Create row 
		 
		Row row = sheet.createRow(11);
		
		// Create cell
		
		 Cell cell = row.createCell(0);
		 cell.setCellValue("Pune");
		 
		 FileOutputStream fos = new FileOutputStream("./Data/TestData.xlsx");
		 wb.write(fos);

	}

}
