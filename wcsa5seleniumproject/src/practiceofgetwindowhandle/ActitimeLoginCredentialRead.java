package practiceofgetwindowhandle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ActitimeLoginCredentialRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
	   FileInputStream fis = new FileInputStream("./Data/actitimelogin.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	     Sheet sheet = wb.getSheet("InvalidCredential");
	     
	     for(int i=0;i<=3;i++)
	     {
	    	 Row row = sheet.getRow(i);
		     Cell cell = row.getCell(0);
		     String data = cell.getStringCellValue();
		     System.out.println(data);
	     }

	}

}
