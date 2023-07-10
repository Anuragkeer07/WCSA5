package popuphandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class IrctcConfirmationPopupHandling {

	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions op = new ChromeOptions();
		 op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.id("disha-banner-close")).click();
		driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("Annukeer");
		 Robot robot = new Robot();
		 
		 // Abstract Window Toolkit Exception
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ffdhc");
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/irctc.png");
		 Files.copy(src, dest);  /// files give IOException
		 driver.quit();

	}

}
