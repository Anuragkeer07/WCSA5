package dataDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5fc7c7e/login.do");
		
		Flib flib = new Flib();
		
		flib.writeExcelData("./Data/actitimelogin.xlsx","InvalidCredential",4,0,1);
		
		int rowcount = flib.getRowCount("./Data/actitimelogin.xlsx","InvalidCredential");
		for(int i=1;i<rowcount;i++)
		{
		
		 driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/actitimelogin.xlsx","InvalidCredential",i, 0));
		 Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/actitimelogin.xlsx","InvalidCredential",i,1));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear(); 
			
		
		}
		
		driver.quit();


	}

}
