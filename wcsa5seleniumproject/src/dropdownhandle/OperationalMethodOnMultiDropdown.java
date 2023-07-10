package dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethodOnMultiDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdownmultiple.html");
		WebElement mul = driver.findElement(By.id("menu"));
		Select sel = new Select(mul);
		
		  
     	  List<WebElement> option = sel.getOptions();
     	
     	for(int i=0;i<option.size();i++)
     	{
     		String op = option.get(i).getText();
     		System.out.println(op);
     	}
     	
     	Thread.sleep(1000);
     
     for(int i=0;i<5;i++)
     {
    	 sel.selectByIndex(i);
    	 
     }
     
     System.out.println("==================");
     WebElement fop = sel.getFirstSelectedOption();
     System.out.println(fop.getText());


	}

}
