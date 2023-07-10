package practiceofframework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadValidfc {
	
		
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/"); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		 FileLib fib = new FileLib();
		 
		
		 
		   driver.findElement(By.id("email")).sendKeys(fib.readExcelData("./Data/fc.xlsx","validfc",1, 0));
			driver.findElement(By.id("pass")).sendKeys( fib.readExcelData("./Data/fc.xlsx","validfc",1, 1));
			Thread.sleep(3000);
			driver.findElement(By.name("login")).click();
			
		 
		 
		 
		}
		


	
	
	   

}
