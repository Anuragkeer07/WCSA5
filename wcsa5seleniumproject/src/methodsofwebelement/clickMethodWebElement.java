package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethodWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usd = driver.findElement(By.name("username"));
		usd.sendKeys("admin");
	    WebElement pwd = driver.findElement(By.name("password"));
	    pwd.sendKeys("admin123");
	   WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
	   button.click();

	}

}
