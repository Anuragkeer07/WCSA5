package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("anuragkeer2@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("xuuddgougy");
		 Thread.sleep(3000);
		//driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
		driver.close();
		
		
		

	}

}
