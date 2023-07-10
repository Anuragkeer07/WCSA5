package dropdownhandle;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/duplicateElementDropdwon.html");
		WebElement dup = driver.findElement(By.id("menu"));
		Select sel = new Select(dup);
		 HashSet<String> hs = new HashSet<String>();
		
		List<WebElement> duplicate = sel.getOptions();
		
		for(WebElement we : duplicate)
		{
			String value = we.getText();
			hs.add(value);
			
		}
		System.out.println(hs);
		

	}

}
