package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5fc7c7e/login.do");
		
		FileInputStream fis = new FileInputStream("./Data/actitimelogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validCredential");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String validuser = cell.getStringCellValue();
		
		Thread.sleep(1000);
		
		FileInputStream fis1 = new FileInputStream("./Data/actitimelogin.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
		Sheet sheet1 = wb.getSheet("validCredential");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(1);
		String validuser1 = cell1.getStringCellValue();
		
		 driver.findElement(By.name("username")).sendKeys(validuser);
		 Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(validuser1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		

	}

}
