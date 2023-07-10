package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSubmitMethodOfWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("anuragkeer");
		driver.findElement(By.name("password")).sendKeys("asfdgnngyhd");
		WebElement sub = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]"));
        sub.submit();
	}

}
