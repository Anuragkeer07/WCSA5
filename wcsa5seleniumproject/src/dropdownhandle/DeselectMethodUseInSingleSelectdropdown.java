package dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethodUseInSingleSelectdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdown.html");
		WebElement singledropdown = driver.findElement(By.id("menu"));
     	Select sel = new Select(singledropdown);
     	
     	boolean check = sel.isMultiple();
     	System.out.println(check);
     	
     	sel.selectByIndex(1);
     	sel.deselectAll();

     	

     	
	}

}
