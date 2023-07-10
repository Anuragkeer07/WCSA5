package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("anuragkeer2@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Anurag@02");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
		
		

	}

}
