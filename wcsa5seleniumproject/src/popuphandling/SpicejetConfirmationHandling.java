package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpicejetConfirmationHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions ch = new ChromeOptions();
		 ch.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(ch);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.spicejet.com/");
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		

	}

}
