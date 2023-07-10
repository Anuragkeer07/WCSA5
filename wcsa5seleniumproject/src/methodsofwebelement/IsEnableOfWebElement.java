package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableOfWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("anuragkeer");
		driver.findElement(By.name("password")).sendKeys("asfdgnngyhd");
		boolean end = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).isEnabled();
        System.out.println(end);
	}

}
