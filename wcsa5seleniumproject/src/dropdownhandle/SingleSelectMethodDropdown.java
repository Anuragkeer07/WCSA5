package dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectMethodDropdown {

	public static void main(String[] args) throws InterruptedException {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdownmultiple.html");
		
		 WebElement mul = driver.findElement(By.id("menu"));
		  Select sel = new Select(mul);
		  
		  sel.selectByIndex(1);
		  sel.selectByValue("v4");
		  sel.selectByVisibleText("Pani puri");
		  Thread.sleep(1000);
//		  sel.deselectByIndex(1);
//		  sel.deselectByValue("v4");
//		  sel.deselectByVisibleText("Pani puri");
		  sel.deselectAll();
		  
		  

	}

}
