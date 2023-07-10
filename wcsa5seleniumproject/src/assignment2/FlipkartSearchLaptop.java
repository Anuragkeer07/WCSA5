package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchLaptop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
	Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(4000);
   driver.findElement(By.xpath("//div[contains(text(),'HP 14')]")).click();
    String title = driver.getTitle();
    System.out.println(title);
   
		
		

	}

}
