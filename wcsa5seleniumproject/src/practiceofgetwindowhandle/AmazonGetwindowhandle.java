package practiceofgetwindowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonGetwindowhandle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(30));
		driver.get("https://www.amazon.in/");
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M14 5G ')])[1]")).click();
		 String parent = driver.getWindowHandle();
		 System.out.println("parents ==>"+parent);
		  Set<String> child = driver.getWindowHandles();
		  System.out.println("for all==>"+child);
		  for(String wh :child) {
		  if (!parent.equals(child)) 
		  {
			driver.switchTo().window(wh);
			
		}
		 
		  }
		  Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("466331");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[text()='Apply']/..")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//img[@class='imgSwatch'])[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//p[text()='4GB + 128GB']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//	 (//span[@id='productTitle']/../../../../ancestor::div)[3]
		  
	

	}

}
