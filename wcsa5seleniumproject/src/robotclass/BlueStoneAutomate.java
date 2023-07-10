package robotclass;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import methodsofwebelement.GetTextMethodOfWebElement;

public class BlueStoneAutomate {

	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handle hidden division popup
		
		driver.findElement(By.id("denyBtn")).click();	
		WebElement watch = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		 Robot robot = new Robot();
	
	// act.moveToElement(driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"))).perform();
		// or
	//	 act.moveToElement(watch).perform();
		 // or
		 
		act.clickAndHold(watch).perform();
		
		for(int i=0;i<=1;i++)
		{
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	//	 String filter = driver.findElement(By.xpath("//div[text()='Filter by']")).getText();
		
		// click and hold
		 WebElement filter = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=1;i<=2;i++)
		{
			act.doubleClick(filter).perform();
		 act.clickAndHold(filter).perform();
		}
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_C);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_C);
		
		 driver.findElement(By.id("search_query_top_elastic_search")).click();
	   //  driver.findElement(By.name("submit_search")).click();
		 
		
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	     
	     if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
	     {
	    	 System.out.println("Filter is successful");
//	    	 TakesScreenshot ts = (TakesScreenshot) driver;
//	    	  File file = ts.getScreenshotAs(OutputType.FILE);
//	    	File dest = new File("./Screenshots/bluestone.png");
//	    	Files.copy(file, dest);
	    	 driver.quit();
	     }
	     else
	     {
	    	 System.out.println("Exception");
	     }
	      
		

	}

}
