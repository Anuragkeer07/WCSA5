package actionsclassmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement blus = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		
		//act.moveToElement(blus).perform();
		
		act.moveToElement(blus).perform();
		driver.findElement(By.xpath("//span[text() ='1 gram' and  @data-p ='gold-coins-weight-1gms,m' ]")).click();
		WebElement coin = driver.findElement(By.id("5920"));
		
		if(coin.isDisplayed())
		{
			driver.quit();
			
		}
		else
		{
			System.out.println("not display");
		}

	}

}
