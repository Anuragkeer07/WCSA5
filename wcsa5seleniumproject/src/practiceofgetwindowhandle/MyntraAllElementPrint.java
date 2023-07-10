package practiceofgetwindowhandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraAllElementPrint {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		act.moveToElement(src).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> shirt = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']//div[@class='product-price']"));
		
		for(int i=0;i<shirt.size();i++)
		{
			 String s = shirt.get(i).getText();
			 String p = price.get(i).getText();
			 System.out.println(s+": "+p);
			 System.out.print("\n");
			
		}
		
		driver.quit();
		
	}

}
