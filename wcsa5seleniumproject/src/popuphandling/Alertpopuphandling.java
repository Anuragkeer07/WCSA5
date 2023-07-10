package popuphandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopuphandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Alertpopup.html");
		
		driver.findElement(By.id("t1")).click();
		Thread.sleep(2000);
		 Robot rt = new Robot();
	//	  driver.switchTo().alert().accept();
		 rt.keyPress(KeyEvent.VK_ENTER);
		 rt.keyRelease(KeyEvent.VK_ENTER);
		 
		

	}

}
