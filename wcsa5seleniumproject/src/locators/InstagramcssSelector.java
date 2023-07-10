package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramcssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("anurag Keer");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("vcchddtr");
	    driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
		

	}

}
