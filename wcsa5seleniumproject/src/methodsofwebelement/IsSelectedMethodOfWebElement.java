package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodOfWebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-5fc7c7e/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("username")).sendKeys("anuragkeer");
		driver.findElement(By.name("pwd")).sendKeys("asfdgnngyhd");
		driver.findElement(By.name("remember")).click();
		boolean sel = driver.findElement(By.name("remember")).isSelected();
		 System.out.println(sel);

	}

}
