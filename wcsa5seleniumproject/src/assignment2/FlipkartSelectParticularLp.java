package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelectParticularLp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(3000);
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
	Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Operating System' ]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Windows 10' and @class='_3879cV' ]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'HP 15s Intel ')] /../..//div[text()='₹41,700']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _')and text()='Add to cart']")).click();
	}

}
