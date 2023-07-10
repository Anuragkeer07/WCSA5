package popuphandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeFileuploadHandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-5fc7c7e/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='Settings']/..")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[@value='2'][1]")).click();
		driver.findElement(By.xpath("//td[@style='padding-left:8px'][1]")).click();
		
	//	Thread.sleep(2000);
//		File fs = new  File("./autoitPrograms/actitimefile.exe");
//		String abpath = fs.getAbsolutePath();
//		Runtime.getRuntime().exec(fs);
		
		
		 Runtime.getRuntime().exec("./autoitPrograms/OmayoFileupload.exe");
		
	
		driver.quit();
		

	}

}
