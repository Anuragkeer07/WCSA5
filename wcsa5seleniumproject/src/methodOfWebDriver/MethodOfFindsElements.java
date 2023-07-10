package methodOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOfFindsElements {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("temple");
		Thread.sleep(2000);
		 List<WebElement> temple = driver.findElements(By.xpath("//textarea[@id='APjFqb']"));
		Thread.sleep(1000) ;
		 
		 for(WebElement we : temple)
		 {
			 Object templeOption;
			templeOption  = we.getText();
			System.out.println(templeOption);
			Thread.sleep(1000);
		 }
		



	}

}
