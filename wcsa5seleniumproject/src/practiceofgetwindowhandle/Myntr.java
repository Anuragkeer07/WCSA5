package practiceofgetwindowhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntr {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		 ChromeOptions ok = op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(ok);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("red dress");
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconS')]")).click();
		
		
		
		

	}

}
