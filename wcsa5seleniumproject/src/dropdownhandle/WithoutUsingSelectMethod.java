package dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutUsingSelectMethod {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdown.html");
		WebElement mul = driver.findElement(By.id("menu"));
		Select sel = new Select(mul);
		List<WebElement> option = sel.getOptions();
		
		for(WebElement we : option)
		{
			if(we.getText().equals("kaju"))
			{
				we.click();
				break;
			}
			
			  
			
		}
		
		
		

	}

}
