package dataDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidloginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5fc7c7e/login.do");
		
		// read the data from execel file and test the login page
		Flib flib = new Flib();
		
		String validuser = flib.readExcelData("./Data/actitimelogin.xlsx","validCredential",1, 0);
		String validpassword = flib.readExcelData("./Data/actitimelogin.xlsx","validCredential", 1, 1);
		driver.findElement(By.name("username")).sendKeys(validuser);
		 Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
