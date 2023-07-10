package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_userLoginId")).sendKeys("anuragkeer2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("dsddssvd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		
		
	}

}
