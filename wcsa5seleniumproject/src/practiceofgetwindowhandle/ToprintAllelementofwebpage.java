package practiceofgetwindowhandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToprintAllelementofwebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("watch");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		List<WebElement> watch = driver.findElements(By.xpath("//a[contains(text(),'Analog Watch  - For Men C')]"));
	   List<WebElement> pr = driver.findElements(By.xpath("//div[text()='₹288']/../../../.."));
		
		
	for(int i =0; i<watch.size();i++)
	  {
		 String wa = watch.get(i).getText();
		  for(int j=0;j<pr.size();j++)
		  {
			  String wapr = pr.get(i).getText();
			  
			  System.out.println(wa+": "+wapr); 
		  }
	  }
	System.out.println("/n");

	}

}
//  //span[text()='1,930']